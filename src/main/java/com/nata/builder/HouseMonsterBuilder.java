package com.nata.builder;

public class HouseMonsterBuilder implements MonsterBuilder {

    private final Monster monster = new Monster();

    @Override
    public void setEyes(int eyes) {
        monster.setEyes(eyes);
    }

    @Override
    public void setHeads(int heads) {
        monster.setHeads(heads);
    }

    @Override
    public void setLimbs(int limbs) {
        monster.setLimbs(limbs);
    }

    @Override
    public void setClaws(int claws) {
        monster.setClaws(claws);
    }

    @Override
    public void setTails(int tails) {
        monster.setTails(tails);
    }

    @Override
    public void setFur(boolean value) {
        monster.setFur(value);
    }

    @Override
    public void setFeathers(boolean value) {
        monster.setFeathers(value);
    }

    @Override
    public Monster getMonster() {
        return monster;
    }
}
