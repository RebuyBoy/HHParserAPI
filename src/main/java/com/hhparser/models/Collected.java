package com.hhparser.models;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Collected {
    private final String name;
    private final BigDecimal value;

}
