package com.company;

import java.util.Scanner;

public class MultidimensionalArrays {
    public static void main(String args[]) {
        int[][] arr = new int[3][3];        // Two sets of square brackets

        /*System.out.println("Enter 9 numbers: ");
        Scanner input = new Scanner(System.in);
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                arr[i][j] = input.nextInt();
            }
        }

        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.printf("%d\t", arr[i][j]);
            }
        }*/

        // Another way...
        int arr2[][] = {        // Length of arr2 = 3
                {9, 7},         // Length of arr2[0] = 3
                {6, 5, 4, 98},  // Length of arr2[1] = 4
                {3, 2, 1}       // Length of arr2[2] = 4
        };

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.printf("%d\t", arr2[i][j]);
            }
            System.out.println();
        }

        // We can also specify only the first dimension
        String[][] text = new String[3][];
        text[0] = new String[2];        // Then allocate dimension for each first dimension references
        text[1] = new String[3];
        text[2] = new String[2];

        text[0][0] = "Input";
        text[0][1] = "Output";
        text[1][0] = "Processor";
        text[1][1] = "Compiler";
        text[1][2] = "Debugger";
        text[2][0] = "Assembler";
        text[2][1] = "Interpreter";

        for (String[] words : text) {
            for (String word: words){
                System.out.print(word + "\t");
            }
            System.out.println();
        }
    }
}
