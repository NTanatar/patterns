package com.nata.visitor.place;

import com.nata.visitor.visitor.Visitor;

public interface Place {
    void accept(Visitor visitor);
}
