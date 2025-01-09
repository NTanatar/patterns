package com.nata.decorator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ExcitedPerson implements Character {

    private final Character person;

    @Override
    public void talk() {
        System.out.println("Wow! Great!");
        person.talk();
        System.out.println("!!!");
    }

    @Override
    public void move() {
        System.out.println("Jumping");
        person.move();
        System.out.println("Jumping several times");
    }
}
