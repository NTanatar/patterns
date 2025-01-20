package com.nata.memento;

public enum FieldState {
    EMPTY,
    BLACK,
    WHITE;

    public String toString() {
        return switch (this) {
            case BLACK -> "B";
            case WHITE -> "W";
            default -> ".";
        };
    }
}
