package com.nata.decorator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SneezingPerson implements Character {

    private final Character person;

    @Override
    public void talk() {
        person.talk();
        System.out.println("Achoo!");
    }

    @Override
    public void move() {
        person.move();
        System.out.println("Achoo!");
    }
}
