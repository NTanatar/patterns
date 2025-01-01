package com.nata.prototype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SnowMan implements Decoration {

    private int size;
    private String color;
    private boolean hat;
    private String nose;
    private String eyes;

    public SnowMan(SnowMan that) {
        this.size = that.size;
        this.color = that.color;
        this.hat = that.hat;
        this.nose = that.nose;
        this.eyes = that.eyes;
    }

    @Override
    public Decoration clone() {
        return new SnowMan(this);
    }

    @Override
    public void shine() {
        System.out.println("Shining snowman: " + color);
    }
}
