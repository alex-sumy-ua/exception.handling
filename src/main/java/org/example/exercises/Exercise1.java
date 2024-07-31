package org.example.exercises;

import org.example.exercises.exceptions.NegativeIntegerInputException;

public class Exercise1 {

    public static int divide(int divident, int divisor) {
        if (divident < 0) {
            throw new NegativeIntegerInputException("The following negative integer(s) are not allowed in this operation: [" + divident + "]");
        }
        if (divisor < 0) {
            throw new NegativeIntegerInputException("The following negative integer(s) are not allowed in this operation: [" + divisor + "]");
        }
        return divident / divisor;

    }
}
