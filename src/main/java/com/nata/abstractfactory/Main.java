package com.nata.abstractfactory;

import com.nata.abstractfactory.model.Glove;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Glove> gloves = new ArrayList<>();
        GloveFactory factory = new BlueFoxGloveFactory("a small fox");
        gloves.add(factory.createLeftGlove());
        gloves.add(factory.createRightGlove());

        factory = new GreenBearGloveFactory("a big bear");
        gloves.add(factory.createLeftGlove());
        gloves.add(factory.createRightGlove());
        System.out.println(gloves);
    }
}
