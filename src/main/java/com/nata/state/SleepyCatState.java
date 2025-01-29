package com.nata.state;

public class SleepyCatState implements CatState {

    private final Cat cat;

    SleepyCatState(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void eat() {
        System.out.println("[S](eat) ignoring");
    }

    @Override
    public void sleep() {
        System.out.println("[S](sleep) ignoring");
        cat.setCurrentState(cat.getGoodMoodState());
    }

    @Override
    public void talk() {
        System.out.println("[S](talk) getting hungry");
        cat.setCurrentState(cat.getHungryState());

    }

    @Override
    public void stroke() {
        System.out.println("(stroke) Hi, is there something to eat?");
        cat.setCurrentState(cat.getHungryState());
    }
}
