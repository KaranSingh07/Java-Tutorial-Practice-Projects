package com.company;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Very basic Robot (with lots of bugs, ofcourse!
        while(true) {
            System.out.println("Enter a command(Type stop to exit): ");
            String cmd = input.nextLine();
            switch (cmd) {
                case "start":
                    System.out.println("Robot started");
                    break;
                case "stop":
                    System.out.println("Robot stopped");
                    System.exit(0);
                case "move":
                    System.out.println("Moving");
                    break;
                default:
                    System.out.println("Command not recognized");
            }
        }
    }
}
