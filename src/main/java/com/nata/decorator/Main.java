package com.nata.decorator;

public class Main {

    public static void main(String[] args) {

        SneezingPerson sneezing = new SneezingPerson(new Person());
        sneezing.talk();
        sneezing.move();

        ExcitedPerson excitedAndSneezing = new ExcitedPerson(sneezing);
        excitedAndSneezing.talk();
        excitedAndSneezing.move();
    }
}
