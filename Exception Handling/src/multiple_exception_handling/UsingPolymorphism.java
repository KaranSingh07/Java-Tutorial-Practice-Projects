package multiple_exception_handling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class UsingPolymorphism {
    public static void main(String args[]) {

        Test test = new Test();
        // 1. Exception in method run()
        try {
            test.run();
        } catch (Exception e) {
            System.out.println("Exception occurred.");
        }

        // 2. Exception in method input()
        try {
            test.input();
        } catch(FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

/*
* 1.)
* Like we saw in the Polymorphism project, any child class can be passed to a method that takes an argument
* as a Parent class of that class. Exception is the Parent class of all exceptions in java and thus we can
* use Exception e in catch block to catch any type of exception.
*
* 2.)
* For the above reason itself, suppose we have another method input() that throws IOException and FileNotFoundException,
* then you must define catch block for FileNotFoundException first. Suppose you defined IOException first and
* if FileNotFoundException occurred, then it will be caught by IOException because IOException is parent class of
* FileNotFoundException and the actual catch block for it will never be reached.
* So always define catch blocks in the same hierarchy according to Child Parent relationship among the exceptions.
* */
