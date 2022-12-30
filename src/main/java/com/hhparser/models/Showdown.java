package com.hhparser.models;

import lombok.Builder;
import lombok.Data;

import java.util.Queue;

@Data
@Builder
public class Showdown {
    private final Queue<Collected> showdowns;
}
