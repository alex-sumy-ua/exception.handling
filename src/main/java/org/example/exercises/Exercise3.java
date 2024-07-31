package org.example.exercises;

public class Exercise3 {
    public static void divide() {

        int[] inputs;

        while (true) {
            try {
                inputs = Exercise2.getUserInput();
            }  catch (ArithmeticException ex) {
                System.out.println("Cannot divide by zero. Please try again.");
//                scanner.next();
            } catch (NegativeIntegerInputException ex) {
                System.out.println("This operation does not accept negative values. Please try again.");
            }


        }

    }
}
