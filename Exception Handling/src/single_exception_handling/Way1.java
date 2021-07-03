package single_exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Way1 {
    public static void main(String args[]) throws FileNotFoundException {

        File file = new File("sample.txt");
        FileReader fileReader = new FileReader(file);

    }
}

/*
* First way to handle exception is to add throws <Exception> in method signature,
* so that procedures calling this method will know that they have to handle these
* exceptions that may occur by this method.
* Demonstrated in simple_exception_handling.WhyWay1.java
* */
