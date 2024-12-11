package com.nata.abstractfactory;

import com.nata.abstractfactory.model.LeftGlove;
import com.nata.abstractfactory.model.RightGlove;

public class GreenBearGloveFactory extends GloveFactory {

    private final String pattern;

    public GreenBearGloveFactory(String pattern) {
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
