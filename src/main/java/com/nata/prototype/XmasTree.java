package com.nata.prototype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class XmasTree implements Decoration {

    private int size;
    private int needles;
    private int branches;
    private String color;
    private boolean lights;
    private boolean cat;

    public XmasTree(XmasTree that) {
        this.size = that.size;
        this.needles = that.needles;
        this.branches = that.branches;
        this.color = that.color;
        this.lights = that.lights;
        this.cat = that.cat;
    }

    @Override
    public Decoration clone() {
        return new XmasTree(this);
    }

    @Override
    public void shine() {
        System.out.println("Shining XmasTree: "+ color);
    }
}
