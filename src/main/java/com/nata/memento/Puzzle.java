package com.nata.memento;

import static com.nata.memento.FieldState.EMPTY;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Base64;

public class Puzzle {

    private FieldState[][] field;

    public Puzzle(int size) {
        this.field = new FieldState[size][size];
        for (FieldState[] fieldStates : this.field) {
            Arrays.fill(fieldStates, EMPTY);
        }
    }

    public static class Memento {
        private final String state;

        public Memento(String state) {
            this.state = state;
        }
    }

    public Memento save() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos;
        try {
            oos = new ObjectOutputStream(baos);
            oos.writeObject(this.field);
            oos.close();
            String state = Base64.getEncoder().encodeToString(baos.toByteArray());
            return new Memento(state);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void restore(Memento memento) {
        try {
            byte[] data = Base64.getDecoder().decode(memento.state);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            this.field = (FieldState[][]) ois.readObject();
            ois.close();
        } catch (ClassNotFoundException e) {
            System.out.print("ClassNotFoundException occurred.");
        } catch (IOException e) {
            System.out.print("IOException occurred.");
        }
    }

    public void set(int x, int y, FieldState newState) {
        if (x < 0 || y < 0 || x >= this.field.length || y >= this.field[0].length) {
            return;
        }
        this.field[x][y] = newState;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (FieldState[] fieldStates : this.field) {
            for (FieldState fieldState : fieldStates) {
                sb.append(fieldState.toString());
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
