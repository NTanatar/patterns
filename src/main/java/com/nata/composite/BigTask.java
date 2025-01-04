package com.nata.composite;

import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BigTask implements Task {

    private final List<Task> tasks;

    @Override
    public int getEstimate() {
        return tasks.stream().mapToInt(Task::getEstimate).sum();
    }
}
