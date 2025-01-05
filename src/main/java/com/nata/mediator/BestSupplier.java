package com.nata.mediator;

public class BestSupplier implements ProductSupplier {

    @Override
    public boolean canSupply(String productName) {
        return !productName.equals("milk");
    }

    @Override
    public void supply(String productName, String address) {
        System.out.println("taking " + productName + " to " + address + " quickly");
    }
}
