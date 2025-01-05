package com.nata.mediator;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class Store {

    private final String address;
    private final Mediator mediator;
    private final List<String> productsToRequest;

    public Store(String address, Mediator mediator) {
        this.address = address;
        this.mediator = mediator;
        this.productsToRequest = new ArrayList<>();
    }

    public void purchase(String product) {
        // ...
        productsToRequest.add(product);
    }

    public void requestProductSupply() {
        productsToRequest.forEach(p -> mediator.request(p, this));
    }
}
