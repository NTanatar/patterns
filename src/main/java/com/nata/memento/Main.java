package com.nata.memento;

import static com.nata.memento.FieldState.BLACK;
import static com.nata.memento.FieldState.WHITE;

public class Main {

    public static void main(String[] args) {
        Puzzle p = new Puzzle(4);

        p.set(0, 0, BLACK);
        p.set(1, 1, BLACK);
        p.set(2, 2, WHITE);
        p.set(3, 3, WHITE);

        System.out.println("Saving state:");
        Puzzle.Memento m = p.save();
        System.out.println(p);

        p.set(0, 1, WHITE);
        p.set(1, 2, WHITE);
        p.set(1, 0, WHITE);
        p.set(2, 1, WHITE);

        System.out.println("Changed state:");
        System.out.println(p);

        System.out.println("Restored state:");
        p.restore(m);
        System.out.println(p);
    }
}
