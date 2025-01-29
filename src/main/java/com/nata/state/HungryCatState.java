package com.nata.state;

public class HungryCatState implements CatState {
    private final Cat cat;

    public HungryCatState(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void eat() {
        System.out.println("[H] Om nom nom");
        cat.setCurrentState(cat.getGoodMoodState());
    }

    @Override
    public void sleep() {
        System.out.println("[H](sleep) I am hungry!");
    }

    @Override
    public void talk() {
        System.out.println("[H](talk) I am hungry!");
    }

    @Override
    public void stroke() {
        System.out.println("[H](stroke) I am hungry!");
    }
}
