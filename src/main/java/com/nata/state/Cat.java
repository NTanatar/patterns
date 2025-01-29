package com.nata.state;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cat {

    private CatState sleepyState;
    private CatState hungryState;
    private CatState goodMoodState;

    private CatState currentState;

    public Cat() {
        this.sleepyState = new SleepyCatState(this);
        this.goodMoodState = new GoodMoodState(this);
        this.hungryState = new HungryCatState(this);
        this.currentState = getHungryState();
    }

    public void eat() {
        currentState.eat();
    }

    public void sleep() {
        currentState.sleep();
    }

    public void talk() {
        currentState.talk();
    }

    public void stroke() {
        currentState.stroke();
    }
}
