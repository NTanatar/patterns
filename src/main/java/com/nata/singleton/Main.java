package com.nata.singleton;

public class Main {

    private final static String BASE_PATH = "C:\\Users\\natalia.tanatarova\\LEARN\\git\\patterns\\logs\\";

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Logger.getLogger(BASE_PATH + "first.log").log("Fooling around");
            DBConnection.INSTANCE.store("l'aereo");
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Logger.getLogger(BASE_PATH + "second.log").log("Rhabarber");
            DBConnection.INSTANCE.store("la verdura");
        }
    }

    public static void main(String[] args) {
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
        Logger.getLogger(BASE_PATH + "third.log").log("main is watching");
        DBConnection.INSTANCE.store("la poltrona");
    }
}
