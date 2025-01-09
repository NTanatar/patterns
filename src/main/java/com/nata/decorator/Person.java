package com.nata.decorator;

public class Person implements Character {

    @Override
    public void talk() {
        System.out.println("talking");
    }

    @Override
    public void move() {
        System.out.println("walking");
    }
}
