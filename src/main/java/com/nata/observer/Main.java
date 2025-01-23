package com.nata.observer;

public class Main {
    public static void main(String[] args) {

        Person bob = new Person("Bob", "awake");
        Person john = new Person("John", "sleepy");

        // people meet in one place -> subscribe
        bob.addSubscriber(john);
        john.addSubscriber(bob);

        // some adventures

        // john gets sick, Corona test is positive
        john.changeState("sick!");
    }
}
