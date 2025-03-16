package com.nata.flyweight;

import lombok.Builder;

@Builder
public class SnowFlakeType {
    private String name;
    private int rotation;
    private int verticalSpeed;
    private int horizontalSpeed;
    // image data

    void calculateFlight(FlyingSnowFlake sf) {
        System.out.println("flying snowflake (" + name + "): " + sf.getX() + " " + sf.getY());
    }
}
