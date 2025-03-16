package com.nata.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FlyingSnowFlake {
    private SnowFlakeType type;
    private int x;
    private int y;

    public void calculateFlight() {
        type.calculateFlight(this);
    }
}
