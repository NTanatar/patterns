package com.nata.adapter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MoonRobotAdapter implements EarthRobot {
    private final MoonRobot moonRobot;

    @Override
    public String execute(EarthRobotCommand command) {
        return moonRobot.performCalculation(convertCommand(command));
    }

    private MoonRobotCommand convertCommand(EarthRobotCommand command) {
        // some logic
        return new MoonRobotCommand();
    }
}
