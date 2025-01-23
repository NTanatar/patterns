package com.nata.observer;

public interface Subscriber {
    void update(String message, Object source);
}
