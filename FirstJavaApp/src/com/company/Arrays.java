package com.company;

public class Arrays {
    public static void main(String args[]) {
        int value = 7;      // It is a value type
        int[] values;       // It is a reference type

        values = new int[3];    // All 3 numbers initialized by 0

        values[0] = 2;
        values[1] = 4;
        values[2] = 6;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);

        for(int i=0; i<values.length; i++){
            System.out.printf("%d\t", values[i]);
        }

        int[] arr = {1, 3, 5};
        System.out.println(arr.length);

        int sum=0;
        for(int i:arr){
            sum += i;
        }

        System.out.printf("Sum is: %d", sum);
    }
}
