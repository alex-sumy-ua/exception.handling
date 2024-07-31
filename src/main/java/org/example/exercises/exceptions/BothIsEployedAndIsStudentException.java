package org.example.exercises.exceptions;

public class BothIsEployedAndIsStudentException extends IllegalArgumentException {
    public BothIsEployedAndIsStudentException(String s) {
        super(s);
    }
}
