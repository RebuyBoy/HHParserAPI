package com.hhparser;

import com.hhparser.models.Action;
import com.hhparser.models.Card;
import com.hhparser.models.Collected;
import com.hhparser.models.Flop;
import com.hhparser.models.HandHistory;
import com.hhparser.models.Player;
import com.hhparser.models.Position;
import com.hhparser.models.Preflop;
import com.hhparser.models.Rio;
import com.hhparser.models.River;
import com.hhparser.models.Showdown;
import com.hhparser.models.Stake;
import com.hhparser.models.Turn;
import com.hhparser.models.Uncalled;
import com.hhparser.parser.HHLexer;
import com.hhparser.parser.HHParser;
import com.hhparser.util.CardsMapper;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collectors;

@Slf4j
@Component
public class GGParser {
    private static final String SPACE_REGEX = " ";
    private final CardsMapper cardsMapper;
    private final Position[] positions;

    private static final int ACTION_TYPE_CONTEXT = 0;
    private static final int ACTION_TOKEN = 0;
    private static final String ACTION_RAISE = "Raises";
    private static final int RAISE_VALUE = 1;
    private static final int ACTIONS_INDEX = 0;
    private static final int FLOP_CARDS_INDEX = 0;
    private static final int TURN_CARD_INDEX = 1;
    private static final int RIVER_CARD_INDEX = 1;

    public GGParser() {
        this.cardsMapper = new CardsMapper();
        positions = new Position[]{
                Position.BU,
                Position.UTG,
                Position.MP,
                Position.HJ,
                Position.CO
        };
    }

    public HandHistory runSingleHand(String handData) {
        try {
            CharStream stream = CharStreams.fromString(handData);
            HHLexer lexer = new HHLexer(stream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            HHParser parser = new HHParser(commonTokenStream);
            HHParser.ParseContext parse = parser.parse();
            HHParser.HandContext context = parse.hand(0);

            return new HandHistory.Builder()
                    .source(handData)
                    .handId(getId(context))
                    .date(getDate(context))
                    .stake(getStake(context))
                    .gameType(getGameType(context))
                    .playersNumber(getPlayersNumber(context))
                    .totalPot(getTotalPot(context))
                    .totalJPRake(getTotalJPRake(context))
                    .totalGGRake(getTotalGGRake(context))
                    .rio(getRIONumber(context))
                    .preflop(getPreflop(context))
                    .flop(getFlop(context))
                    .turn(getTurn(context))
                    .river(getRiver(context))
                    .showdown(getShowdown(context))
                    .players(getPlayers(context))
                    .build();
        } catch (Exception e) {
            log.error("id: " + handData.substring(12, 24) + " error : " + e.getMessage());
        }
        return new HandHistory.Builder()
                .isBad(true)
                .source(handData)
                .build();
    }

    private Preflop getPreflop(HHParser.HandContext context) {
        return Preflop.builder()
                //TODO fix isAnyActions of flop was dealt but no actions made
                .isAnyActions(true)
                .actions(context.preflopActions()
                        .moves()
                        .action()
                        .stream()
                        .map(this::mapToAction)
                        .toList())
                .uncalled(getUncalled(context.preflopActions().moves()))
                .build();
    }

    private Flop getFlop(HHParser.HandContext context) {
        return context.postflopActions() == null ?
                Flop.builder()
                        .isAnyActions(false)
                        .build() :
                Flop.builder()
                        .isAnyActions(true)
                        .actions(getActions(context.postflopActions().flop(ACTIONS_INDEX).moves()))
                        .uncalled(getUncalled(context.postflopActions().flop(ACTIONS_INDEX).moves()))
                        .cards(getCards(removeBrackets(context.postflopActions().flop(ACTIONS_INDEX).flop_street_cards().CARDS().get(FLOP_CARDS_INDEX).getText())))
                        .build();
    }

    private Turn getTurn(HHParser.HandContext context) {
        return context.postflopActions() == null || context.postflopActions().turn(ACTIONS_INDEX) == null ?
                Turn.builder().build() :
                Turn.builder()
                        .isAnyActions(true)
                        .actions(getActions(context.postflopActions().turn(ACTIONS_INDEX).moves()))
                        .uncalled(getUncalled(context.postflopActions().turn(ACTIONS_INDEX).moves()))
                        .card(getCard(removeBrackets(context.postflopActions().turn(ACTIONS_INDEX).turn_street_cards().CARDS(TURN_CARD_INDEX).getText())))
                        .build();
    }

    private River getRiver(HHParser.HandContext context) {
        return context.postflopActions() == null || context.postflopActions().river(ACTIONS_INDEX) == null ?
                River.builder().build() :
                River.builder()
                        .isAnyActions(true)
                        .actions(getActions(context.postflopActions().river(ACTIONS_INDEX).moves()))
                        .uncalled(getUncalled(context.postflopActions().river(ACTIONS_INDEX).moves()))
                        .card(getCard(removeBrackets(context.postflopActions().river(ACTIONS_INDEX).river_street_cards().CARDS(RIVER_CARD_INDEX).getText())))
                        .build();
    }

    private Showdown getShowdown(HHParser.HandContext context) {
        Queue<Collected> collectedQueue = new LinkedList<>();
        context.showdowns()
                .collected()
                .forEach(collected -> collectedQueue.add(Collected.builder()
                        .name(collected.name().getText())
                        .value(convertToBigDecimal(collected.cash().NUMBER().getText()))
                        .build()));
        return Showdown.builder()
                .showdowns(collectedQueue)
                .build();
    }

    private Action mapToAction(HHParser.ActionContext actionContext) {
        return Action.builder()
                .name(actionContext.name().getText())
                .actionType(getActionType(actionContext))
                .value(convertCurrency(actionContext))
                .build();
    }

    private String getActionType(HHParser.ActionContext actionContext) {
        return actionContext.action_type()
                .children.get(ACTION_TYPE_CONTEXT)
                .getChild(ACTION_TOKEN)
                .getText();
    }

    private List<Uncalled> getUncalled(HHParser.MovesContext moves) {
        return moves == null || moves.uncalledBet().isEmpty() ?
                Collections.emptyList() :
                moves.uncalledBet()
                        .stream()
                        .map(this::mapToUncalled)
                        .toList();
    }

    private Uncalled mapToUncalled(HHParser.UncalledBetContext uncalledBetContext) {
        return Uncalled.builder()
                .name(uncalledBetContext.name().getText())
                .value(convertValue(uncalledBetContext.cash().NUMBER().getText()))
                .build();

    }


    private List<Action> getActions(HHParser.MovesContext moves) {
        return moves == null ?
                Collections.emptyList() :
                moves.action()
                        .stream()
                        .map(this::mapToAction)
                        .collect(Collectors.toCollection(LinkedList::new));
    }

    private List<Card> getCards(String cards) {
        return cards == null ?
                Collections.emptyList() :
                Arrays.stream(cards.split(SPACE_REGEX))
                        .map(this::getCard)
                        .collect(Collectors.toCollection(LinkedList::new));
    }

    private Card getCard(String card) {
        return card == null ?
                null :
                cardsMapper.getCard(card);
    }

    private String removeBrackets(String cards) {
        return cards.substring(1, cards.length() - 1);
    }

    private Map<String, Player> getPlayers(HHParser.HandContext context) {
        int tableBuPosition = Integer.parseInt(context.info().buttonInfo().buttonPosition().NUMBER().getText());
        Map<String, Player> namePlayerReferences = new HashMap<>();
        Map<String, Position> playersPosition = getPosition(context, tableBuPosition);
        for (HHParser.PositionStackSizeInfoContext positionContext : context.info().positionStackSizeInfo()) {
            String name = positionContext.name().getText();
            Player player = getPlayer(context, positionContext, name, playersPosition);
            namePlayerReferences.put(name, player);
        }
        return namePlayerReferences;
    }

    private Map<String, Position> getPosition(HHParser.HandContext context, int tableBuPosition) {
        List<HHParser.PositionStackSizeInfoContext> positionContext = context.info().positionStackSizeInfo();
        int buIndex = 0;
        for (HHParser.PositionStackSizeInfoContext positionInfo : positionContext) {
            int seatNumber = Integer.parseInt(positionInfo.position().NUMBER().getText());
            if (seatNumber == tableBuPosition) {
                break;
            }
            buIndex++;
        }
        Map<String, Position> playersPosition = new HashMap<>();
        int tableSize = positionContext.size();
        playersPosition.put(positionContext.get(buIndex).name().getText(), positions[0]);
        int missedPlayers = 5 - tableSize;
        int currentIndex = buIndex + 1 == tableSize ? 0 : buIndex + 1;
        int currentPosIndex = 1 + missedPlayers;
        while (currentIndex != buIndex) {
            playersPosition.put(positionContext.get(currentIndex).name().getText(), positions[currentPosIndex]);
            currentIndex = currentIndex == tableSize - 1 ? 0 : currentIndex + 1;
            currentPosIndex++;
        }
        return playersPosition;

    }

    private Player getPlayer(HHParser.HandContext context, HHParser.PositionStackSizeInfoContext positionContext, String name, Map<String, Position> positions) {
        return Player.builder()
                .name(name)
                .tableSeatNumber(Integer.parseInt(positionContext.position().NUMBER().getText()))
                .stackSize(convertToBigDecimal(positionContext.stakeSize().cash().NUMBER().getText()))
                .holeCards(getHoleCards(context, name))
                .position(positions.get(name))
                .collected(getCollected(context, name))
                .straddle(getStraddle(context, name))
                .build();
    }

    private BigDecimal getStraddle(HHParser.HandContext context, String name) {
        return context.info().postBlindInfo().stream()
                .filter(postBlindInfoContext -> postBlindInfoContext.name().getText().equals(name))
                .filter(postBlindInfoContext -> postBlindInfoContext.POST_BLIND_TEXT().getText().equals("straddle"))
                .map(postBlindInfoContext -> convertValue(postBlindInfoContext.blindSize().cash().NUMBER().getText()))
                .reduce((first, second) -> second)
                .orElse(BigDecimal.ZERO);
    }

    private BigDecimal getCollected(HHParser.HandContext context, String name) {
        return context.showdowns()
                .collected()
                .stream()
                .filter(collectedContext -> collectedContext.name().getText().equals(name))
                .map(collectedContext -> convertValue(collectedContext.cash().NUMBER().getText()))
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);
    }

    private List<Card> getHoleCards(HHParser.HandContext context, String name) {
        return context.pocketCards()
                .dealtCards()
                .stream()
                .filter(dealt -> dealt.CARDS() != null && dealt.name().getText().equals(name))
                .map(dealt -> getCards(removeBrackets(dealt.CARDS().getText())))
                .findFirst()
                .orElse(Collections.emptyList());
    }

    private BigDecimal convertCurrency(HHParser.ActionContext actionContext) {
        if (getActionType(actionContext).equalsIgnoreCase(ACTION_RAISE)) {
            String raise = actionContext.action_type()
                    .raise()
                    .cash()
                    .get(RAISE_VALUE)
                    .NUMBER()
                    .getText();
            return convertValue(raise);
        }
        return actionContext.cash() == null ?
                BigDecimal.ZERO :
                convertValue(actionContext.cash().NUMBER().getText());
    }

    private BigDecimal convertValue(String value) {
        return convertToBigDecimal(value);
    }

    private Rio getRIONumber(HHParser.HandContext context) {
        int size = context.showdowns().showdown().size();
        Rio rio;
        switch (size) {
            case 1 -> rio = Rio.ONE;
            case 2 -> rio = Rio.TWO;
            case 3 -> rio = Rio.THREE;
            default -> throw new IllegalArgumentException("incorrect rio number");
        }
        return rio;
    }

    private BigDecimal getTotalGGRake(HHParser.HandContext context) {
        String totalGGRake = context
                .summary()
                .summaryInfo()
                .rake()
                .cash()
                .NUMBER()
                .getText();
        return convertToBigDecimal(totalGGRake);
    }

    private BigDecimal getTotalJPRake(HHParser.HandContext context) {
        String totalJPRake = context.summary()
                .summaryInfo()
                .jackpot()
                .cash()
                .NUMBER()
                .getText();
        return convertToBigDecimal(totalJPRake);
    }

    private static BigDecimal convertToBigDecimal(String value) {
        value = value.replace(",", "");
        return BigDecimal.valueOf(Double.parseDouble(value));
    }

    private BigDecimal getTotalPot(HHParser.HandContext context) {
        String totalPot = context.summary()
                .summaryInfo()
                .totalPot()
                .cash()
                .NUMBER()
                .getText();
        return convertToBigDecimal(totalPot);
    }

    private int getPlayersNumber(HHParser.HandContext context) {
        return context
                .pocketCards()
                .dealtCards()
                .size();
    }

    private String getGameType(HHParser.HandContext context) {
        return context
                .info()
                .baseHandInfo()
                .gameInfo()
                .GAME_TYPE()
                .getText();
    }

    private Stake getStake(HHParser.HandContext context) {
        String blindValue = context
                .info()
                .baseHandInfo()
                .gameInfo()
                .stake()
                .cash()
                .NUMBER()
                .getText();
        return Stake.getStakeByBlindValue(blindValue);
    }

    private String getId(HHParser.HandContext ctx) {
        return ctx.info()
                .baseHandInfo()
                .id()
                .ID()
                .getText();
    }

    private LocalDateTime getDate(HHParser.HandContext ctx) {
        String date = ctx
                .info()
                .baseHandInfo()
                .date()
                .DATE()
                .getText();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/d HH:mm:ss");
        return LocalDateTime.parse(date, format);
    }
}
