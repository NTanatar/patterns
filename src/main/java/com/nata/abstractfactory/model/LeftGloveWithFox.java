package com.nata.abstractfactory.model;

public class LeftGloveWithFox extends LeftGlove {
    @Override
    public void applyPattern(String pattern) {
        setPattern("Left Glove with " + pattern + " fox");
    }
}
