package com.company;

class Person {
    // Classes can contain 2 things:
    // 1.) Data (States/ Instance variables):
    String name;
    short age;

    // 2.) Subroutines (Behaviour/ Methods):
    void speak() {
        System.out.print("Hi, I'm " + name + " and I'm " + age + " years old.\n");
    }
}

class Fruit {
    String name;
    String color;
    String shape;

    void throw_() {
        if (shape.equals("Round")) {
            System.out.print("Throwing " + name + "...\n");
        } else {
            System.out.print(name + " is not round so can't be thrown.");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Karan Singh";
        p1.age = 21;

        Person p2 = new Person();
        p2.name = "Himanshu Pal";
        p2.age = 23;

        p1.speak();
        p2.speak();

        Fruit apple = new Fruit();
        apple.name = "Apple";
        apple.color = "Red";
        apple.shape = "Round";

        Fruit banana = new Fruit();
        banana.name = "Banana";
        banana.color = "Yellow";
        banana.shape = "Cylinder";

        apple.throw_();
        banana.throw_();
    }
}
