package com.nata.abstractfactory.model;

public class RightGloveWithBear extends RightGlove {
    @Override
    public void applyPattern(String pattern) {
        setPattern("Right Glove with " + pattern + " bear");
    }
}
