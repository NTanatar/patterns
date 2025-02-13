package com.nata.visitor.visitor;

import com.nata.visitor.place.Market;
import com.nata.visitor.place.Museum;

public class Businessman implements Visitor {

    @Override
    public void visitMuseum(Museum museum) {
        System.out.println("Name: " + museum.getName() + ", price: " + museum.getPrice());
    }

    @Override
    public void visitMarket(Market market) {
        System.out.println("Name: " + market.getName());
    }
}
