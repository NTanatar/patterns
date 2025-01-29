package com.nata.state;

public class GoodMoodState implements CatState {

    private final Cat cat;

    GoodMoodState(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void eat() {
        System.out.println("[GM] Thanks, om nom nom");
        cat.setCurrentState(cat.getSleepyState());
    }

    @Override
    public void sleep() {
        System.out.println("[GM] (sleep) getting hungry");
        cat.setCurrentState(cat.getHungryState());
    }

    @Override
    public void talk() {
        System.out.println("[GM] hi, miau, getting hungry");
        cat.setCurrentState(cat.getHungryState());
    }

    @Override
    public void stroke() {
        System.out.println("[GM] hi, murrr, getting hungry");
        cat.setCurrentState(cat.getHungryState());
    }
}
