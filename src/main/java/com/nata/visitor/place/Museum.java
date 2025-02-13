package com.nata.visitor.place;

import com.nata.visitor.visitor.Visitor;
import java.util.List;
import lombok.Getter;

@Getter
public class Museum implements Place {

    List<String> pictures;

    String name;

    Long price;

    Integer size;

    public Museum() {
        pictures = List.of("The Great Wave off Kanagawa", "The Starry Night");
        name = "National Art Museum";
        price = 5000000L;
        size = 300;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitMuseum(this);
    }
}
