package com.hhparser.models;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Uncalled {
    String name;
    BigDecimal value;
}
