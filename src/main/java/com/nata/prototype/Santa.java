package com.nata.prototype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Santa implements Decoration {

    private int size;
    private String color;
    private boolean sledge;
    private boolean sack;

    public Santa(Santa that) {
        this.size = that.size;
        this.color = that.color;
        this.sledge = that.sledge;
        this.sack = that.sack;
    }

    @Override
    public Decoration clone() {
        return new Santa(this);
    }

    @Override
    public void shine() {
        System.out.println("Shining Santa: " + color);
    }
}
