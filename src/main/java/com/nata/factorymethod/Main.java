package com.nata.factorymethod;

public class Main {
    public static void main(String[] args) {
        SnowFactory factory = new FrostySnowFactory();
        factory.create().fly();

        factory = new ChristmasSnowFactory();
        factory.create().fly();
    }
}
