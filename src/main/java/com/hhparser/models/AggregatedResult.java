package com.hhparser.models;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class AggregatedResult {
    private int handsNumber;
    private BigDecimal totalGGRake;
    private BigDecimal totalJPRake;
    private BigDecimal profit;
    private BigDecimal hours;
    private BigDecimal profitPerHour;
}
