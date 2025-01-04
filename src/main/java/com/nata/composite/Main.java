package com.nata.composite;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Task t1 = new SimpleTask(2);
        Task t2 = new SimpleTask(3);
        Task t3 = new SimpleTask(4);
        Task t4 = new SimpleTask(5);
        Task t5 = new BigTask(List.of(t1, t2, new BigTask(List.of(t3, t4))));

        System.out.println(t5.getEstimate());
    }
}
