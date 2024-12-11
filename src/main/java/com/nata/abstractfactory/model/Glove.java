package com.nata.abstractfactory.model;

import lombok.Getter;

@Getter
public class Glove {
    private final String pattern;

    public Glove(String pattern) {
        this.pattern = pattern;
    }
}
