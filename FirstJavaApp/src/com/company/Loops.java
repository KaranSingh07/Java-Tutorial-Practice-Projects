package com.company;

import java.util.Scanner;

public class Loops {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = input.nextInt();
        // For loop:
        for(int i=0; i<n; i++){
            System.out.printf("%d\t", i);
        }
        System.out.println();

        // While loop:
        int j=0;
        while(j<n){
            System.out.printf("%d\t", j);
            j++;
        }
        System.out.println();

        // Do while loop:
        int k=0;
        do{
            System.out.printf("%d\t", k);
            k++;
        }while(k<n);
    }
}
