package com.nata.proxy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

public class EnhancedMenuPlanner implements MenuPlanner {

    private MenuPlanner menuPlanner;

    public List<String> getMenu() {
        if (menuPlanner == null) {
            menuPlanner = new SimpleMenuPlanner();
        }
        List<String> result = menuPlanner.getMenu();
        if (LocalDate.now().getDayOfWeek() == DayOfWeek.SUNDAY) {
            result.add("Chocolate Mousse");
        }
        return result;
    }
}
