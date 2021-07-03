package multiple_exception_handling;

import java.io.IOException;
import java.text.ParseException;

public class App {
    public static void main(String args[]) {
        Test test = new Test();

        /*  First way...
        try {
            test.run();
        } catch (IOException e) {
            System.out.println("IOException occurred.");
        } catch (ParseException e) {
            System.out.println("ParseException occurred.");
        }
         */

        // Second way...
        try {
            test.run();
        } catch (IOException | ParseException e) {
            System.out.println("Something went wrong!");
        }

    }
}

/*
 * This is one way to handle multiple exception by writing catch block for each Exception.
 * We can also use OR ( | ) operator to define one catch for two or more exceptions.
 * */
