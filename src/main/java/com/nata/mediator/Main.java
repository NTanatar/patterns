package com.nata.mediator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new StoreSupply(List.of(
            new BestSupplier(),
            new OtherSupplier()));

        Store store1 = new Store("Baker Street", mediator);
        Store store2 = new Store("Times square", mediator);

        // some products are bought
        store1.purchase("cheese");
        store1.purchase("bread");
        store1.purchase("milk");
        store2.purchase("candy");

        // end of the day: check what is missing and order
        store1.requestProductSupply();
        store2.requestProductSupply();
    }
}
