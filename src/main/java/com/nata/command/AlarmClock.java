package com.nata.command;

import java.util.List;
import lombok.Setter;

@Setter
public class AlarmClock {

    private List<Command> commands;

    public void triggerAlarm() {
        commands.forEach(Command::execute);
    }
}
