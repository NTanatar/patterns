package com.nata.visitor.visitor;

import com.nata.visitor.place.Market;
import com.nata.visitor.place.Museum;

public class Teenager implements Visitor {

    @Override
    public void visitMuseum(Museum m) {
        System.out.println("Pictures: " + m.getPictures());
    }

    @Override
    public void visitMarket(Market m) {
        System.out.println("Volume: " + m.getVolume());
    }
}
