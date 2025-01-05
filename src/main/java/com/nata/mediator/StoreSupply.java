package com.nata.mediator;

import java.util.List;

public class StoreSupply implements Mediator {

    private final List<ProductSupplier> suppliers;

    public StoreSupply(List<ProductSupplier> suppliers) {
        this.suppliers = suppliers;
    }

    @Override
    public void request(String product, Store sender) {
        for (ProductSupplier supplier : suppliers) {
            if (supplier.canSupply(product)) {
                supplier.supply(product, sender.getAddress());
                break;
            }
        }
    }
}
