package com.nata.composite;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class SimpleTask implements Task {
    private final int estimate;
}
