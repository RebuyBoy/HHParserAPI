package com.hhparser.models;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
public class Player {
    private final String name;
    private final Position position;
    private final BigDecimal stackSize;
    private final int tableSeatNumber;
    private final BigDecimal straddle;
    private final List<Card> holeCards;
    private BigDecimal collected;
    private BigDecimal profit;
    private BigDecimal ggRake;
    private BigDecimal jpRake;
}
