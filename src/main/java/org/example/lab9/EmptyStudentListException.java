package org.example.lab9;

public class EmptyStudentListException extends RuntimeException{

    public EmptyStudentListException(String message) {
        super(message);
    }

    public EmptyStudentListException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyStudentListException(Throwable cause) {
        super(cause);
    }
}
