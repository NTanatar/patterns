package com.nata.abstractfactory.model;

public class RightGlove extends Glove {

    public RightGlove(String pattern) {
        super(pattern);
    }
    @Override
    public String toString() {
        return "Right Glove with " + getPattern();
    }
}
