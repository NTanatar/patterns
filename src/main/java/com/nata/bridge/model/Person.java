package com.nata.bridge.model;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Person {
    private final Character character;

    public void talk() {
        character.talk();
    }
}
