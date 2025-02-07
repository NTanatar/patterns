package com.nata.templatemethod;

public abstract class Person {

    public void draw() {
        drawHead();
        drawArms();
        drawTrunk();
        drawLegs();
    }

    public abstract void drawHead();

    public void drawArms() {
        System.out.println(" /||\\");
    }

    public abstract void drawTrunk() ;

    public void drawLegs() {
        System.out.println("  JL ");
    }
}
