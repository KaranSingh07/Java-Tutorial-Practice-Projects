import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        File file = new File("sample.txt");

        try(BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            br.write("This is first line");
            br.newLine();
            br.write("This is second line");
            br.newLine();
            br.write("This is third line");
            br.newLine();
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}

/*
* Just like reading files, we use Try With Resources with File wrtiting, so that file will be automatically closed.
* */
