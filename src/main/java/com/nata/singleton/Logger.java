package com.nata.singleton;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class Logger {

    private static volatile Logger instance;

    private final FileHandler fileHandler;

    private Logger(String fileName) {
        try {
            this.fileHandler = new FileHandler(fileName, true);

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static Logger getLogger(String fileName) {
        Logger result = instance;

        if (result != null) {
            return result;
        }
        synchronized(Logger.class) {
            if (instance == null) {
                instance = new Logger(fileName);
            }
            return instance;
        }
    }

    public void log(String message) {
        fileHandler.publish(new LogRecord(Level.INFO, message));
    }
}
