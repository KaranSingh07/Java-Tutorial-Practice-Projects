package single_exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class WhyWay1 {
    public static void main(String args[]) {
        String path = "sample.txt";

        try {
            readFile(path);     // Now we know, readFile() may throw FileNotFoundException, so we will handle it
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found: " + path);
        }

    }

    public static void readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
    }
}

