package com.nata.abstractfactory;

import com.nata.abstractfactory.model.LeftGlove;
import com.nata.abstractfactory.model.RightGlove;

public abstract class GloveFactory {
    public abstract RightGlove createRightGlove();
    public abstract LeftGlove createLeftGlove();
}
