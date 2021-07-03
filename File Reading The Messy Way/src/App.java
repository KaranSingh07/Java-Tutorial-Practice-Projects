import java.io.*;

public class App {
    public static void main(String[] args) {

        File file = new File("sample.txt");

        BufferedReader br = null;

        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);

            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        }

        finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
/*
* This is very messy old way of reading files using FileReader and BufferedReader.
* Plenty of try-catches are required and that too are nested, because of this reason we use a very clean
* and efficient newer way introduces in Java 7 Try With Resources that is demonstrated in next project.
*
* Note: File Writing can also be done the exact same way, just by replacing the FileReader and BufferedReader
* by FileWriter and BufferedWriter and by using methods to write.
* */

