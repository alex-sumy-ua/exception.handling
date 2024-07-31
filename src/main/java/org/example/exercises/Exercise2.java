package org.example.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {

    public static int[] getUserInput() {

        Scanner scanner = new Scanner(System.in);
        int deviser;
        int devider;
        double result;

        while (true) {
            try {
                System.out.println("Please, deviser");
                devider = scanner.nextInt();
                System.out.println("Please, devider");
                deviser = scanner.nextInt();
                result = Exercise1.divide(deviser, deviser);
            } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please try again.");
                    scanner.next();
                } /*catch () {

            }*/

        }

    }

}