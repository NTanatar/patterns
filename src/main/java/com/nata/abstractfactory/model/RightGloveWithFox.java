package com.nata.abstractfactory.model;

public class RightGloveWithFox extends RightGlove {
    @Override
    public void applyPattern(String pattern) {
        setPattern("Right Glove with " + pattern + " fox");
    }
}
