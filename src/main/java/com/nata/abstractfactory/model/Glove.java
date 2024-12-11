package com.nata.abstractfactory.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Glove {
    protected String pattern;

    @Override
    public String toString() {
        return pattern;
    }
}
