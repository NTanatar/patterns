package com.nata.factorymethod;

import com.nata.factorymethod.model.SimpleStar;
import com.nata.factorymethod.model.SnowFlake;

public class ChristmasSnowFactory implements SnowFactory {

    @Override
    public SnowFlake create() {
        return new SimpleStar();
    }
}
