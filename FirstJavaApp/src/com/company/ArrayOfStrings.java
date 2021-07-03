package com.company;

public class ArrayOfStrings {
    public static void main(String args[]){
        String[] names = {"Karan", "Himanshu", "Avinish"};
        // Long way: String[] names = new String[3], then place each names using the index

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        int x = 10;
        String[] fruits = new String[x];     // Variable length array
        System.out.println(fruits.length);

        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Orange";

        for (String fruit: fruits){
            System.out.println(fruit);      // Short way (It will also iterate through null values)
        }

        String temp = null;       // temp is a reference to type String, which is by default null

    }
}
