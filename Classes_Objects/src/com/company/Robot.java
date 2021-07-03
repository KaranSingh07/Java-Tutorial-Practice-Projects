/*
* This program demonstrate Constructors, Constructor overloading, Default and Parameterized constructors,
* Getters and Setters, Use of this keyword (for both accessing instance variables and calling another constructor)
* */

package com.company;

public class Robot {
    private int height;
    private String material, name ;

    public Robot(){             // Constructor never returns any value
        this("Anna");
    }
    public Robot(String name){
        System.out.print("Robot made... Name set to " + name + "\n");
        this.name = name;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public int getHeight(){
        return height;
    }

    public String getMaterial(){
        return material;
    }

    public void walk(String direction, int distance){
        System.out.print("Walked in " + direction + " direction for" + distance + " meters.\n");
    }

    public static void main(String args[]){
        Robot r1 = new Robot("Ronnie"); // Using parameterized constructor
        r1.setHeight(4);
        r1.setMaterial("Steel");

        Robot r2 = new Robot();                // Using default constructor
        r2.setHeight(5);
        r2.setMaterial("Iron");

    }
}
