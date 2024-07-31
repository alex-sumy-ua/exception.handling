package org.example.exercises.exceptions;

public class FullNameException extends IllegalArgumentException {
    public FullNameException(String s) {
        super(s);
    }
}
