package com.hhparser.models;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Action {
    String name;
    String actionType;
    BigDecimal value;
}
