package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.println("Hello World!");

        // Using Scanner class to take user input
        Scanner input = new Scanner(System.in);

        for (int i=0; i<3; i++) {
            System.out.printf("\nUser %d Enter your age: ", i+1);
            int age = input.nextInt();

            if (age < 18) {
                System.out.println("Not eligible for voting.");
            } else {
                System.out.println("Eligible for voting");
            }
        }
    }
}
