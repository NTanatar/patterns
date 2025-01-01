package com.nata.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Decoration> createDefaultDecorations() {
        List<Decoration> decorations = new ArrayList<>();
        decorations.add(XmasTree.builder()
            .size(50)
            .branches(20)
            .needles(2500)
            .color("green")
            .cat(false)
            .lights(true)
            .build());
        decorations.add(Santa.builder()
            .size(30)
            .color("red")
            .sledge(true)
            .sack(true)
            .build());
        decorations.add(SnowMan.builder()
            .size(25)
            .hat(true)
            .color("white")
            .nose("carrot")
            .eyes("black")
            .build());
        return decorations;
    }

    public static void main(String[] args) {
        List<Decoration> first = createDefaultDecorations();

        first.stream()
            .map(Decoration::clone)
            .peek(d -> d.setColor("blue"))
            .forEach(Decoration::shine);

        first.stream()
            .map(Decoration::clone)
            .peek(d -> d.setColor("yellow"))
            .forEach(Decoration::shine);

        first.forEach(Decoration::shine);
    }
}
