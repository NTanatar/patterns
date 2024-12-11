package com.nata.abstractfactory;

import com.nata.abstractfactory.model.LeftGlove;
import com.nata.abstractfactory.model.LeftGloveWithBear;
import com.nata.abstractfactory.model.RightGlove;
import com.nata.abstractfactory.model.RightGloveWithBear;

public class GreenBearGloveFactory extends GloveFactory {

    private final String pattern;

    public GreenBearGloveFactory(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public RightGlove createRightGlove() {
        RightGlove rightGlove = new RightGloveWithBear();
        rightGlove.applyPattern(pattern);
        return rightGlove;
    }

    @Override
    public LeftGlove createLeftGlove() {
        LeftGlove leftGlove = new LeftGloveWithBear();
        leftGlove.applyPattern(pattern);
        return leftGlove;
    }
}
