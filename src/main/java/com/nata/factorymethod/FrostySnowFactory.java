package com.nata.factorymethod;

import com.nata.factorymethod.model.Needle;
import com.nata.factorymethod.model.SnowFlake;

public class FrostySnowFactory implements SnowFactory {

    @Override
    public SnowFlake create() {
        return new Needle();
    }
}
