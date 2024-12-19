package com.nata.command;

public class GetNewspapers extends Command {

    private final EntranceHallRobot robot;

    public GetNewspapers(EntranceHallRobot robot) {
        this.robot = robot;
    }

    public void execute() {
        robot.getNewsPapers();
    }
}
