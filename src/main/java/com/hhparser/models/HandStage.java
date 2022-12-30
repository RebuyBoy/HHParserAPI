package com.hhparser.models;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
abstract class HandStage {
    private final List<Action> actions;
    private final List<Uncalled> uncalled;
    private final boolean isAnyActions;
}
