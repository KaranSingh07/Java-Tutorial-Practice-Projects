import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App2 {
    public static void main(String args[]) throws FileNotFoundException {
        String filePath = "/home/karansingh/IdeaProjects/Reading Files Scanner/sample2.txt";

        /* Reading from home path (If a file existed in this package)
            filePath = "sample3.txt"; only the name is enough
        */

        Scanner input = new Scanner(new File(filePath));    // Shortcut

        System.out.println(input.nextInt());
        System.out.println(input.nextInt());
        System.out.println(input.next());                   // .next() reads one word, and also don't read the \n
        System.out.println(input.nextDouble());
        System.out.println(input.next());

        input.close();
    }
}
