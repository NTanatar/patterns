package com.nata.visitor.place;

import com.nata.visitor.visitor.Visitor;
import lombok.Getter;

@Getter
public class Market implements Place {

    String name;

    int size;

    int volume;

    int dangerLevel;

    public Market() {
        name = "Central Market";
        size = 210;
        volume = 40;
        dangerLevel = 10;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitMarket(this);
    }
}
