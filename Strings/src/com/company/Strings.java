package com.company;

// Illustrates StringBuilder, String Formatting, toString()
// Just scroll down, Frog class is used far ahead in the program
class Frog {
    private int id;
    private String name;

    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append(id).append(": ").append(name);
        return sb.toString();

        /*  Memory inefficient way of using concatenating strings:
            return id + ": " + name;    */

        /*  One more way:
            return String.format("%d: %s", id, name);   */
    }
}

public class Strings {

    public static void main(String[] args) {
        /* Inefficient way (Using immutable String type)... */
        String info = "";
        info += "My name is Karan Singh.";
        info += " ";
        info += "I'm a Software Engineer.";
        System.out.println(info);
        // It seems like String info is changing everytime, but actually we're creating a new String everytime we do
        // assignment. It is because Strings are immutable types in Java and can't be changed.
        // So this very inefficient because it uses a lot of Memory
        /* --------------------------- */

        /* StringBuilder */
        // The Solution is StringBuilder...
        StringBuilder sb_info = new StringBuilder("");
        sb_info.append("My name is Karan Singh.");
        sb_info.append(" ");
        sb_info.append("I'm from Jodhpur, Rajasthan.");

        System.out.println(sb_info.toString());
        // It is very efficient since it is actually modifying the String rather than creating new copies.

        // Shortcut: Method Chaining of append()
        StringBuilder sb_info2 = new StringBuilder("");
        sb_info2.append("I'm Karan Singh")
                .append("I have done MCA.")
                .append("I have first worked in Metacube Softwares, Jaipur.");
        /* ----------------*/

        /* StringBuffer */
        // StringBuffer (Just a thread safe version of StringBuilder)
        // It is safe to access while using multithreading.
        // Older than StringBuilder, more likely to see it in older codes
        /* ---------------- */

        /* String Formatting */
        System.out.println("This is some text\tThat was a tab.\nThat was a newline.");
        System.out.print("Some text without going to newline.");

        // %d, %s and alignment:
        int cost = 50;
        System.out.printf("\nCost: %d", cost);
        System.out.printf("\nCost: %5d", cost);         // 5 spaces before cost (Actually "set width for the number")
        System.out.printf("\nCost: %-5dOK", cost);      // 5 spaces after cost
        // Very useful at following type of cases:
        for (int i = 0; i < 20; i++) {
            System.out.printf("%2d: %s\n", i, "Some text here");
        }

        // %f: Floating point values
        System.out.printf("Value of PI: %f", Math.PI);
        // Rounding off at specified decimal places
        System.out.printf("\nValue of PI: %.4f", Math.PI);
        System.out.printf("\nValue of PI: %.3f", Math.PI);
        // Round off and setting width combined
        System.out.printf("\nValue of PI: %5.2f", Math.PI);

        /* --------------------------------------------------------------------- */
        /* IMPORTANT:
         *   There is a class named as Object Class which is parent of every class in Java.
         *   One do not need to specify this, every class have Object CLass as parent class implicitly
         *   and it can use the methods of the Object Class.
         */

        // We can create object of "Object Class" to demonstrate the methods available in Object Class
        Object obj = new Object();

        // Let's use our Frog class now
        Frog frog1 = new Frog(1, "Freddy");
        Frog frog2 = new Frog(2, "Roger");
        Frog frog3 = new Frog(3, "Canvie");
        // Now, Frog class is secretly inheriting the Object class
        // so each method of Object class is also available to Frog class
        // Use obj. and frog1. to check :)

        System.out.println("\n-----------------------------");
        System.out.println(frog1);
        System.out.println(frog2);
        System.out.println(frog3);
        // Whenever we print any object, it implicitly invokes the toString() method of the class
        // from which the method belongs.
        // We specified toString() in the Frog class so it is printed.
        // But, if we don't specify a toString() method in the class, then class name followed by the
        // HashCode (A unique identifier for all your objects in Java) of that object is printed
        // Like this: com.company.Frog@452b3a41 (Comment out that method in Frog class and see by yourself)
        // This HashCode is very helpful in debugging.

    }
}
