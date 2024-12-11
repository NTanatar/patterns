package com.nata.abstractfactory;

import com.nata.abstractfactory.model.LeftGlove;
import com.nata.abstractfactory.model.LeftGloveWithFox;
import com.nata.abstractfactory.model.RightGlove;
import com.nata.abstractfactory.model.RightGloveWithFox;

public class BlueFoxGloveFactory extends GloveFactory {

    private final String pattern;

    public BlueFoxGloveFactory(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public RightGlove createRightGlove() {
        RightGlove rightGlove = new RightGloveWithFox();
        rightGlove.applyPattern(pattern);
        return rightGlove;
    }

    @Override
    public LeftGlove createLeftGlove() {
        LeftGlove leftGlove = new LeftGloveWithFox();
        leftGlove.applyPattern(pattern);
        return leftGlove;
    }
}
