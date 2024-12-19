package com.nata.command;

public class WakeUp extends Command {
    private final BedRoomRobot robot;

    public WakeUp(BedRoomRobot robot) {
        this.robot = robot;
    }
    public void execute() {
        robot.turnOnLight();
        robot.turnOnRadio(50);
    }
}
