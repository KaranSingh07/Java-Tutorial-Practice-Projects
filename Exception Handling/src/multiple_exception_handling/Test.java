package multiple_exception_handling;

import java.io.*;
import java.text.ParseException;
import java.util.Scanner;

public class Test {
    public void run() throws IOException, ParseException {

        // ...
        // ...
        // throw new IOException();
        // ...
        // ...

        throw new ParseException("Error in command 3.", 2);
    }

    public void input() throws IOException, FileNotFoundException {

    }
}

/*
* Note: Any one of them can be thrown.
* */
