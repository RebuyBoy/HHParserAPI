package com.hhparser.models;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

@Data
public class HandHistory {
    private final boolean isBad;
    private final String source;
    private final String handID;
    private final String gameType;
    private final LocalDateTime date;
    private final Stake stake;
    private final int playersNumber;
    private final BigDecimal totalPot;
    private final BigDecimal totalGGRake;
    private final BigDecimal totalJPRake;
    private final Rio rio;
    private final Preflop preflop;
    private final Flop flop;
    private final Turn turn;
    private final River river;
    private final Showdown showdown;
    private final Map<String, Player> players;

    private HandHistory(Builder builder) {
        this.isBad = builder.isBad;
        this.source = builder.source;
        this.handID = builder.handID;
        this.gameType = builder.gameType;
        this.date = builder.date;
        this.stake = builder.stake;
        this.playersNumber = builder.playersNumber;
        this.totalPot = builder.totalPot;
        this.totalGGRake = builder.totalGGRake;
        this.totalJPRake = builder.totalJPRake;
        this.rio = builder.rio;
        this.preflop = builder.preflop;
        this.flop = builder.flop;
        this.turn = builder.turn;
        this.river = builder.river;
        this.showdown = builder.showdown;
        this.players = builder.players;
    }

    public static class Builder {
        private boolean isBad;
        private String source;
        private String handID;
        private String gameType;
        private LocalDateTime date;
        private Stake stake;
        private int playersNumber;
        private BigDecimal totalPot;
        private BigDecimal totalGGRake;
        private BigDecimal totalJPRake;
        private Rio rio;
        private Preflop preflop;
        private Flop flop;
        private Turn turn;
        private River river;
        private Showdown showdown;
        private Map<String, Player> players;

        public Builder isBad(boolean isBad) {
            this.isBad = isBad;
            return this;
        }

        public Builder source(String source) {
            this.source = source;
            return this;
        }


        public Builder handId(String handID) {
            this.handID = handID;
            return this;
        }

        public Builder gameType(String gameType) {
            this.gameType = gameType;
            return this;
        }

        public Builder date(LocalDateTime date) {
            this.date = date;
            return this;
        }

        public Builder stake(Stake stake) {
            this.stake = stake;
            return this;
        }

        public Builder playersNumber(int playersNumber) {
            this.playersNumber = playersNumber;
            return this;
        }

        public Builder totalPot(BigDecimal totalPot) {
            this.totalPot = totalPot;
            return this;
        }

        public Builder totalJPRake(BigDecimal totalJPRake) {
            this.totalJPRake = totalJPRake;
            return this;
        }

        public Builder totalGGRake(BigDecimal totalGGRake) {
            this.totalGGRake = totalGGRake;
            return this;
        }

        public Builder rio(Rio rio) {
            this.rio = rio;
            return this;
        }

        public Builder preflop(Preflop preflop) {
            this.preflop = preflop;
            return this;
        }

        public Builder flop(Flop flop) {
            this.flop = flop;
            return this;
        }

        public Builder turn(Turn turn) {
            this.turn = turn;
            return this;
        }

        public Builder river(River river) {
            this.river = river;
            return this;
        }

        public Builder showdown(Showdown showdown) {
            this.showdown = showdown;
            return this;
        }

        public Builder players(Map<String, Player> players) {
            this.players = players;
            return this;
        }

        private void postConstruct() {

        }

        public HandHistory build() {
            postConstruct();
            return new HandHistory(this);
        }
    }
}
