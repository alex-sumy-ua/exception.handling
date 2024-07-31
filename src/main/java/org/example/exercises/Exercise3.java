package org.example.exercises;

import org.example.exercises.exceptions.NegativeIntegerInputException;

public class Exercise3 {
    public static void divide() {

        int[] inputs;

        while (true) {
            try {
                inputs = Exercise2.getUserInput();
            }  catch (ArithmeticException ex) {
                System.out.println("Cannot divide by zero. Please try again.");
            } catch (NegativeIntegerInputException ex) {
                System.out.println(ex.getMessage());
            }


        }

    }
}
