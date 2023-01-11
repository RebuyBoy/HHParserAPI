package com.hhparser;

import com.hhparser.models.Action;
import com.hhparser.models.AggregatedResult;
import com.hhparser.models.HandHistory;
import com.hhparser.models.Player;
import com.hhparser.models.Position;
import com.hhparser.models.Stake;
import com.hhparser.models.Uncalled;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

@Component
@Slf4j
public class AggregateService {
    private static final String HERO_NICKNAME = "Hero";
    private static final Duration MIN_HAND_DURATION = Duration.ofSeconds(120);
    private final GGParser parser;

    public AggregateService(GGParser parser) {
        this.parser = parser;
    }

    //TODO AOP benchmark
    public List<AggregatedResult> aggregate(List<String> hands) {
        return this.process(hands.stream()
                        .map(parser::runSingleHand)
                        .toList())
                .stream()
                .sorted(Comparator.comparing(AggregatedResult::getStake))
                .toList();
    }

    private List<AggregatedResult> process(List<HandHistory> handHistory) {
        List<HandHistory> sortedByDate = handHistory.stream()
                .filter(hand -> !hand.isBad())
                .distinct()
                .sorted(Comparator.comparing(HandHistory::getDate))
                .toList();

        Map<Stake, AggregatedResult> collect = sortedByDate.stream()
                .collect(groupingBy(AggregateService::checkStake, collectingAndThen(toList(), this::count)));

        if (collect.size() > 1) {
            AggregatedResult totalResults = getTotalResults(collect.values());
            totalResults.setHours(countHours(sortedByDate));
            collect.put(Stake.S_TOTAL, totalResults);
        }
        for (Map.Entry<Stake, AggregatedResult> aggregatedResultEntry : collect.entrySet()) {
            AggregatedResult aggregatedResult = aggregatedResultEntry.getValue();
            aggregatedResult.setStake(aggregatedResultEntry.getKey());
            aggregatedResult.setProfitPerHour(countProfitPerHour(aggregatedResult));
            aggregatedResult.setProfit(aggregatedResult.getProfit().setScale(0, RoundingMode.HALF_DOWN));
            aggregatedResult.setHours(aggregatedResult.getHours().setScale(1, RoundingMode.HALF_DOWN));
            aggregatedResult.setProfit(aggregatedResult.getProfit().setScale(0, RoundingMode.HALF_DOWN));
            aggregatedResult.setGgRake(aggregatedResult.getGgRake().setScale(0, RoundingMode.HALF_DOWN));
            aggregatedResult.setJpRake(aggregatedResult.getJpRake().setScale(0, RoundingMode.HALF_DOWN));
        }
        return collect.values().stream().toList();
    }

    private static Stake checkStake(HandHistory hh) {
        Stake stake = hh.getStake();
        return stake == null ? Stake.S_UNK : stake;
    }

    private BigDecimal countProfitPerHour(AggregatedResult result) {
        return result.getProfit().divide(result.getHours(), 1, RoundingMode.HALF_EVEN);
    }

    private AggregatedResult count(HandHistory hand) {
        Player hero = hand.getPlayers().get(HERO_NICKNAME);
        BigDecimal totalPotWithOutRake = getTotalPotWithOutRake(hand);
        BigDecimal playerCollected = hero.getCollected();
        BigDecimal ggRake = BigDecimal.ZERO;
        BigDecimal jpRake = BigDecimal.ZERO;
        BigDecimal profit = countTotalInvestments(hand).negate();
        if (!playerCollected.equals(BigDecimal.ZERO)) {
            BigDecimal ratio = playerCollected.divide(totalPotWithOutRake, 1, RoundingMode.HALF_EVEN);
            ggRake = hand.getTotalGGRake().multiply(ratio);
            jpRake = hand.getTotalJPRake().multiply(ratio);
            profit = profit.add(playerCollected);
        }
        return AggregatedResult.builder()
                .ggRake(ggRake)
                .jpRake(jpRake)
                .profit(profit)
                .hands(1)
                .build();
    }

    private static BigDecimal getTotalPotWithOutRake(HandHistory hand) {
        return hand.getTotalPot()
                .subtract(hand.getTotalJPRake())
                .subtract(hand.getTotalGGRake());
    }

    private AggregatedResult count(List<HandHistory> handHistory) {
        AggregatedResult total = AggregatedResult.builder()
                .ggRake(BigDecimal.ZERO)
                .jpRake(BigDecimal.ZERO)
                .profit(BigDecimal.ZERO)
                .build();
        for (HandHistory hand : handHistory) {
            total = sum(total, count(hand));
        }
        total.setHours(countHours(handHistory));

        return total;
    }

    private AggregatedResult getTotalResults(Collection<AggregatedResult> values) {
        return values.stream()
                .reduce(this::sum)
                .orElseThrow(IllegalArgumentException::new);
    }

    private AggregatedResult sum(AggregatedResult result1, AggregatedResult result2) {
        return AggregatedResult.builder()
                .ggRake(result1.getGgRake().add(result2.getGgRake()))
                .jpRake(result1.getJpRake().add(result2.getJpRake()))
                .profit(result1.getProfit().add(result2.getProfit()))
                .hands(result1.getHands() + result2.getHands())
                .build();
    }

    private BigDecimal countTotalInvestments(HandHistory handHistory) {
        BigDecimal anteValue = Stake.getBlindValueByStake(handHistory.getStake());
        BigDecimal investments = isButton(handHistory) ?
                anteValue :
                BigDecimal.ZERO;
        BigDecimal heroStraddles = handHistory.getPlayers().get(HERO_NICKNAME).getStraddle();
        investments = investments.compareTo(heroStraddles) > 0 ?
                investments :
                heroStraddles;
        BigDecimal uncalled = BigDecimal.ZERO;

        if (handHistory.getPreflop().isAnyActions()) {
            investments = getPreflopInvestments(handHistory.getPreflop().getActions(), investments);
            uncalled = uncalled.add(countUncalled(handHistory.getPreflop().getUncalled()));
        }
        if (handHistory.getFlop().isAnyActions()) {
            investments = investments.add(getPostFlopInvestments(handHistory.getFlop().getActions()));
            uncalled = uncalled.add(countUncalled(handHistory.getFlop().getUncalled()));
        }
        if (handHistory.getTurn().isAnyActions()) {
            investments = investments.add(getPostFlopInvestments(handHistory.getTurn().getActions()));
            uncalled = uncalled.add(countUncalled(handHistory.getTurn().getUncalled()));
        }
        if (handHistory.getRiver().isAnyActions()) {
            investments = investments.add(getPostFlopInvestments(handHistory.getRiver().getActions()));
            uncalled = uncalled.add(countUncalled(handHistory.getRiver().getUncalled()));
        }

        return investments.subtract(uncalled).add(anteValue);
    }

    private static boolean isButton(HandHistory handHistory) {
        return handHistory.getPlayers().get(HERO_NICKNAME).getPosition().equals(Position.BU);
    }

    private BigDecimal getPreflopInvestments(List<Action> actions, BigDecimal investments) {
        for (Action action : actions) {
            if (action.getName().equals(HERO_NICKNAME)) {
                if (action.getActionType().equals("raises")) {
                    investments = action.getValue();
                } else {
                    investments = investments.add(action.getValue());
                }
            }
        }
        return investments;
    }

    private BigDecimal getPostFlopInvestments(List<Action> actions) {
        BigDecimal investments = BigDecimal.ZERO;
        for (Action action : actions) {
            if (action.getName().equals(HERO_NICKNAME)) {
                if (action.getActionType().equals("raises")) {
                    investments = action.getValue();
                } else {
                    investments = investments.add(action.getValue());
                }
            }
        }
        return investments;
    }

    private BigDecimal countUncalled(List<Uncalled> uncalledList) {
        return uncalledList == null ?
                BigDecimal.ZERO :
                uncalledList.stream()
                        .filter(uncalled -> uncalled.getName().equals(HERO_NICKNAME))
                        .map(Uncalled::getValue)
                        .reduce(BigDecimal::add)
                        .orElse(BigDecimal.ZERO);
    }

    private BigDecimal countHours(List<HandHistory> hands) {
        if (hands.isEmpty()) {
            return BigDecimal.ZERO;
        }
        List<LocalDateTime> times = hands.stream()
//                .sorted(Comparator.comparing(HandHistory::getDate))
                .map(HandHistory::getDate)
                .toList();
        Duration totalDuration = Duration.ZERO;
        LocalDateTime start = null;
        LocalDateTime prev = null;
        for (LocalDateTime time : times) {
            if (start == null) {
                start = time;
                prev = time;
            } else if (isBiggerThan600seconds(prev, time)) {
                Duration between = getDuration(start, prev);
                totalDuration = totalDuration.plus(between);
                start = time;
                prev = time;
            } else {
                prev = time;
            }
        }
        Duration between = getDuration(start, prev);
        totalDuration = totalDuration.plus(between);
        return convertDurationToHours(totalDuration);
    }

    private static BigDecimal convertDurationToHours(Duration totalDuration) {
        BigDecimal durationMinutes = BigDecimal.valueOf(totalDuration.toMinutes());
        return durationMinutes.divide(BigDecimal.valueOf(60), 2, RoundingMode.HALF_EVEN);
    }

    private Duration getDuration(LocalDateTime start, LocalDateTime prev) {
        Duration duration = Duration.between(start, prev);
        return duration.getSeconds() == 0 ? MIN_HAND_DURATION : duration;
    }

    private boolean isBiggerThan600seconds(LocalDateTime from, LocalDateTime to) {
        return Duration.between(from, to).toMinutes() > 5;
    }
}


