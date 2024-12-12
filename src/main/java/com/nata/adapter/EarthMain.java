package com.nata.adapter;

public class EarthMain {

    public static void main(String[] args) {

        EarthRobot robot = new MoonRobotAdapter(new MoonRobot());

        System.out.println(robot.execute(new EarthRobotCommand()));
    }
}
