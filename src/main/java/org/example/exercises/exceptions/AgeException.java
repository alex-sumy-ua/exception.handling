package org.example.exercises.exceptions;

public class AgeException extends IllegalArgumentException {
    public AgeException(String s) {
        super(s);
    }
}
