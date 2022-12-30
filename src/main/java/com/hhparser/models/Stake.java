package com.hhparser.models;

import java.math.BigDecimal;
import java.util.EnumMap;
import java.util.Map;

public enum Stake {
    S_1000, S_500, S_200, S_100, S_50, S_25, S_10, S_5, S_2, TOTAL, UNK;

    private static final Map<Stake, Double> BY_LEVEL = new EnumMap<>(Stake.class);

    static {
        BY_LEVEL.put(Stake.S_2, 0.02);
        BY_LEVEL.put(Stake.S_5, 0.05);
        BY_LEVEL.put(Stake.S_10, 0.1);
        BY_LEVEL.put(Stake.S_25, 0.25);
        BY_LEVEL.put(Stake.S_50, 0.5);
        BY_LEVEL.put(Stake.S_100, 1.0);
        BY_LEVEL.put(Stake.S_200, 2.0);
        BY_LEVEL.put(Stake.S_500, 5.0);
        BY_LEVEL.put(Stake.S_1000, 10.0);
    }

    public static BigDecimal getBlindValueByStake(Stake stake) {
        return BigDecimal.valueOf(BY_LEVEL.get(stake));
    }

    public static Stake getStakeByBlindValue(String blind) {
        double blindValue = Double.parseDouble(blind);
        for (Map.Entry<Stake, Double> entry : BY_LEVEL.entrySet()) {
            if (entry.getValue() == blindValue) {
                return entry.getKey();
            }
        }
        throw new IllegalArgumentException("Stake not found " + blind);
    }
}
