package com.nata.proxy;

public class MenuPlannerProvider {

    public static MenuPlanner getMenuPlanner() {
        return new EnhancedMenuPlanner();
    }
}
