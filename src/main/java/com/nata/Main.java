package com.nata;

import com.nata.factorymethod.ChristmasSnowFactory;
import com.nata.factorymethod.FrostySnowFactory;
import com.nata.factorymethod.SnowFactory;

public class Main {

    public static void main(String[] args) {

        SnowFactory factory = new FrostySnowFactory();
        factory.create().fly();

        factory = new ChristmasSnowFactory();
        factory.create().fly();
    }
}