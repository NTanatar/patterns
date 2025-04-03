package com.nata.singleton;


public enum DBConnection {
    INSTANCE;

    public void store(String name) {
        System.out.println("Storing " + name);
    }
}
