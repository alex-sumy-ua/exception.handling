package org.example;

import org.example.exercises.Exercise1;
import org.example.exercises.Exercise2;

public class Main {
    public static void main(String[] args) {
//
//            System.out.println(Exercise1.divide(10, 2));
//            System.out.println(Exercise1.divide(10, 0));
//
//
        int[] inputs;
        inputs = Exercise2.getUserInput();
        System.out.println(Exercise1.divide(inputs[0], inputs[1]));

    }

}