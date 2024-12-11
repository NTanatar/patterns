package com.nata.abstractfactory;

import com.nata.abstractfactory.model.LeftGlove;
import com.nata.abstractfactory.model.RightGlove;

public class BlueFoxGloveFactory extends GloveFactory {

    private final String pattern;

    public BlueFoxGloveFactory(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public RightGlove createRightGlove() {
        return new RightGlove(pattern);
    }

    @Override
    public LeftGlove createLeftGlove() {
        return new LeftGlove(pattern);
    }
}
