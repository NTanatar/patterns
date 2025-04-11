package com.nata.proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleMenuPlanner implements MenuPlanner {

    @Override
    public List<String> getMenu() {
        return new ArrayList<>(Arrays.asList("Soup", "Potatoes", "Meat", "Salad", "Coffee"));
    }
}
