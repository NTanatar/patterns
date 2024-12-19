package com.nata.command;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // robots living their life
        EntranceHallRobot entranceHallRobot = new EntranceHallRobot();
        BedRoomRobot bedRoomRobot = new BedRoomRobot();
        KitchenRobot kitchenRobot = new KitchenRobot();

        // in the evening:
        AlarmClock alarmClock = new AlarmClock();
        alarmClock.setCommands(List.of(
            new WakeUp(bedRoomRobot),
            new GetNewspapers(entranceHallRobot),
            new PrepareBreakfast(kitchenRobot, "Belgian")
        ));

        // in the morning:
        alarmClock.triggerAlarm();
    }
}
