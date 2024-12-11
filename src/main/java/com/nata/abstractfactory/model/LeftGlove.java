package com.nata.abstractfactory.model;

public class LeftGlove extends Glove {

    public LeftGlove(String pattern) {
        super(pattern);
    }
    @Override
    public String toString() {
        return "Left Glove with " + getPattern();
    }
}
