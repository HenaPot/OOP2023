package org.example.lab9;

import java.util.NoSuchElementException;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(Throwable cause) {
        super(cause);
    }

    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
