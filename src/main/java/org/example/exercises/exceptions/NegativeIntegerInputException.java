package org.example.exercises.exceptions;


public class NegativeIntegerInputException extends IllegalArgumentException {

    public NegativeIntegerInputException(String s) {
        super(s);
    }
}
