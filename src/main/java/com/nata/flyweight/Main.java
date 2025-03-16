package com.nata.flyweight;

import static java.util.stream.IntStream.range;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        SnowFlakeType simpleStar = SnowFlakeType.builder()
            .name("SimpleStar")
            .horizontalSpeed(5)
            .verticalSpeed(4)
            .rotation(3)
            .build();
        SnowFlakeType stellar = SnowFlakeType.builder()
            .name("StellarDendrite")
            .horizontalSpeed(3)
            .verticalSpeed(2)
            .rotation(2)
            .build();

        int maxX = 200;
        int maxY = 10;
        Random random = new Random();
        // 100 snowflakes of each type
        range(0, 100).forEach(i ->
            new FlyingSnowFlake(simpleStar, random.nextInt(maxX), random.nextInt(maxY)).calculateFlight());
        range(0, 100).forEach(i ->
            new FlyingSnowFlake(stellar, random.nextInt(maxX), random.nextInt(maxY)).calculateFlight());
    }
}
