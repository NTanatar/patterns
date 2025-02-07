package com.nata.templatemethod;

public class Woman extends Person {

    @Override
    public void drawHead() {
        System.out.println(" .... ");
        System.out.println(" /()\\ ");
    }

    @Override
    public void drawTrunk() {
        System.out.println("/ /\\ \\");
        System.out.println(" /  \\");
        System.out.println(" ^^^^");
    }
}
