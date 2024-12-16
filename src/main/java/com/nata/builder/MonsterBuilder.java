package com.nata.builder;

public interface MonsterBuilder {
    void setEyes(int eyes);
    void setHeads(int heads);
    void setLimbs(int limbs);
    void setClaws(int claws);
    void setTails(int tails);
    void setFur(boolean value);
    void setFeathers(boolean value);
    Monster getMonster();
}
