package com.nata.proxy;

import java.util.List;

public class EnhancedMenuPlanner implements MenuPlanner {

    private final MenuPlanner menuPlanner;

    public EnhancedMenuPlanner(MenuPlanner menuPlanner) {
        this.menuPlanner = menuPlanner;
    }

    public List<String> getMenu() {
        List<String> result = menuPlanner.getMenu();
        result.add("Chocolate Mousse");
        return result;
    }
}
