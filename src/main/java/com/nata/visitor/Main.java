package com.nata.visitor;

import com.nata.visitor.place.Market;
import com.nata.visitor.place.Museum;
import com.nata.visitor.place.Place;
import com.nata.visitor.visitor.Businessman;
import com.nata.visitor.visitor.Teenager;
import com.nata.visitor.visitor.YoungDog;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Place> placeList = List.of(new Museum(), new Market());

        Businessman bob = new Businessman();
        placeList.forEach(p -> p.accept(bob));

        YoungDog andy = new YoungDog();
        placeList.forEach(p -> p.accept(andy));

        Teenager sam = new Teenager();
        placeList.forEach(p -> p.accept(sam));
    }
}
