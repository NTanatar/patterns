package com.nata.proxy;

public class Client {

    public static void main(String[] args) {
        MenuPlanner menuPlanner = MenuPlannerProvider.getMenuPlanner();
        System.out.println(menuPlanner.getMenu());
    }
}
