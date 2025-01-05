package com.nata.mediator;

public interface ProductSupplier {
    boolean canSupply(String productName);
    void supply(String productName, String address);
}
