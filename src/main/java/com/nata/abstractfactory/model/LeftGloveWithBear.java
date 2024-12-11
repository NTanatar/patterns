package com.nata.abstractfactory.model;

public class LeftGloveWithBear extends LeftGlove {

    @Override
    public void applyPattern(String pattern) {
        setPattern("Left Glove with " + pattern + " bear");
    }
}
