package com.nata.visitor.visitor;

import com.nata.visitor.place.Market;
import com.nata.visitor.place.Museum;

public interface Visitor {
    void visitMuseum(Museum m);

    void visitMarket(Market m);
}
