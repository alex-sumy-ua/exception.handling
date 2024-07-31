package org.example.exercises;

public class Exercise1 {

    public static int divide(int a, int b) {
        if (a < 0) {
            throw new NegativeIntegerInputException("The following negative integer(s) are not allowed in this operation: [" + a + "]");
        }
        if (b < 0) {
            throw new NegativeIntegerInputException("The following negative integer(s) are not allowed in this operation: [" + b + "]");
        }
        return a / b;

    }
}
