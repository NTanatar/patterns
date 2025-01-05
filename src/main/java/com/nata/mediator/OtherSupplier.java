package com.nata.mediator;

public class OtherSupplier implements ProductSupplier {

    @Override
    public boolean canSupply(String productName) {
        return true;
    }

    @Override
    public void supply(String productName, String address) {
        System.out.println("taking " + productName + " to " + address + " slowly");
    }
}
