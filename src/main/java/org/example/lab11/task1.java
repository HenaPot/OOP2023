package org.example.lab11;

import com.mysql.cj.log.Log;

public class task1 {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("This is an ordinary log message");

        logger.logWarning("This is a warning! Tread lightly!");
    }
}

class Logger {
    private static Logger instance;
    private Logger() {}

    public static Logger getInstance() {
        synchronized (Logger.class) {
            if (instance == null) {
                instance = new Logger();
            }
            return instance;
        }
    }

    public void log(String message) {
        System.out.println(message);
    }
    public void logInfo(String message) {
        System.out.println(message);
    }
    public void logWarning(String message) {
        System.out.println(message);
    }
    public void logError(String message) {
        System.out.println(message);
    }
}
