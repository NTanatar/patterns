package com.nata.visitor.visitor;

import com.nata.visitor.place.Market;
import com.nata.visitor.place.Museum;

public class YoungDog implements Visitor {

    @Override
    public void visitMuseum(Museum m) {
        System.out.println("Size: " + m.getSize());
    }

    @Override
    public void visitMarket(Market m) {
        System.out.println("Size: " + m.getSize() + ", danger " + m.getDangerLevel());
    }
}
