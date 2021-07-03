import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String args[]) throws FileNotFoundException {
        String filePath = "/home/karansingh/IdeaProjects/Reading Files Scanner/sample.txt";  // *1

        File textFile = new File(filePath);

        Scanner input = new Scanner(textFile);       // *2

        int count = 1;

        while(input.hasNext()) {                     // *3
            String line = input.nextLine();
            System.out.println(count + ". " + line);
            count++;
        }

        input.close();
    }
}

/*
 * 1. If you use backslashes in path (like in Windows) use double backslashes to prevent the execution of
 *    meaning of escape sequences.
 *
 * 2. Scanner takes a object of File type so we have made it in previous line and passed it. If the path is not
 *    valid and file not found, then Scanner throws a FileNotFoundException. So either we have to surround it
 *    in try-catch, or declare it using throws keyword at the method signature.
 *
 * 3. We're looping through the file contents using while loop. hasNext() will return true until there exists lines
 *    of text. In the loop body we're reading file line by line by storing into line variable and printing it.
 *    There are also methods available for reading integers, floats etc.
 *
 * Refer to App2 for int, float etc.
 * */
