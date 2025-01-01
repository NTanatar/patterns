package com.nata.prototype;

public interface Decoration {
    void shine();
    void setColor(String color);
    Decoration clone();
}
