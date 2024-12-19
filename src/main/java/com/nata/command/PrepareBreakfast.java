package com.nata.command;

public class PrepareBreakfast extends Command {

    private final KitchenRobot robot;
    private final String breakfastName;

    public PrepareBreakfast(KitchenRobot robot, String breakfastName) {
        this.robot = robot;
        this.breakfastName = breakfastName;
    }

    @Override
    public void execute() {
        robot.prepareBreakfast(breakfastName);
    }
}
