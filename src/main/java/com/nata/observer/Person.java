package com.nata.observer;

import java.util.ArrayList;
import java.util.List;

public class Person implements Subscriber, Publisher {

    private final String name;
    private final List<Subscriber> subscribers = new ArrayList<>();

    private String state;

    public Person(String name, String state) {
        this.name = name;
        this.state = state;
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        subscribers.forEach(subscriber -> subscriber.update(state, this));
    }

    @Override
    public void update(String message, Object source) {
        System.out.println(name + " got update: '" + message + "' from " + source);
    }

    public void changeState(String state) {
        this.state = state;
        notifySubscribers();
    }

    public String toString() {
        return "Person [name=" + name + ", state=" + state + "]";
    }
}
