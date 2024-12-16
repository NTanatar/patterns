package com.nata.builder;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@NoArgsConstructor
public class Monster {
    private int eyes;
    private int heads;
    private int limbs;
    private int claws;
    private int tails;
    private boolean fur;
    private boolean feathers;
}
