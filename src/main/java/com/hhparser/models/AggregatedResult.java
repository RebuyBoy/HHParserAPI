package com.hhparser.models;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class AggregatedResult {
    private Stake stake;
    private int handsNumber;
    private BigDecimal hours;
    private BigDecimal ggRake;
    private BigDecimal jpRake;
    private BigDecimal profit;
    private BigDecimal profitPerHour;
}
