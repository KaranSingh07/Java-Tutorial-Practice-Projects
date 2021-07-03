package single_exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Way2 {
    public static void main(String args[]) {

        File file = new File("sample.txt");

        try {
            FileReader fileReader = new FileReader(file);
            // Below code will only execute if exception do not occur.
            // -- any code here --
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found: " + file.toString());
        }

    }
}

/*
* Second way to handle exception is to enclose the code in which exception may occur
* in try-catch blocks. If the exception occurs then only the body of catch will execute.
* */
