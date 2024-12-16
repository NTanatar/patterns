package com.nata.builder;

public class Main {

    public static void main(String[] args) {
        MonsterBuilder builder = new HouseMonsterBuilder();

        builder.setFeathers(true);
        builder.setHeads(1);
        builder.setEyes(3);
        builder.setLimbs(2);
        System.out.println(builder.getMonster());
    }
}
