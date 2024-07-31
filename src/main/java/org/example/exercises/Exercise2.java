package org.example.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {

    public static int[] getUserInput() {

        Scanner scanner = new Scanner(System.in);
        int divident;
        int divisor;
        int size = 0;
        double result;

        try {
            System.out.println("Please, input the even size of an array:");
            size = scanner.nextInt();
        } catch (IllegalArgumentException iae) {
            System.out.println("Illegal size of the array.");
        }

        int[] array = new int[size];
        int counter = 0;

        while (counter < size) {
            try {
                System.out.println("Please, deviser");
                divident = scanner.nextInt();
                System.out.println("Please, devider");
                divisor = scanner.nextInt();
                result = Exercise1.divide(divident, divisor);
                System.out.println("Result " + result);
                array[counter] = divident;
                array[counter + 1] = divisor;
                counter += 2;
            } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please try again.");
                    scanner.next();
            }

        }
        scanner.close();
        return array;

    }

}