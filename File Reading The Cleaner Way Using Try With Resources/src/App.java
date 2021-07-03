import java.io.*;

public class App {
    public static void main(String[] args) {

        File file = new File("sample.txt");

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        }
    }
}

/*
* --- Try With Resources ---
* Introduced in Java 7, it is a very clean way to open and read files.
* We don't have to worry about calling close method anymore by using this.
* It is similar to Python's with ... as ... :
* We can also specify multiple resources inside the try(...; ...; ...) separated by semicolons.
*
* How it works? Open the Explanation.java file and find out.
* */
