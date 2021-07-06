import java.io.*;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        String[] urls = {
                "https://www.facebook.com/karansingh.solanki.98478",
                "https://instagram.com/karansingh_solanki",
                "https://github.com/KaranSingh07"};

        URLLibrary urlLibrary = new URLLibrary(urls);

        Iterator<String> iterator = urlLibrary.iterator();

        int index = 0;

        // let's traverse and save url content to html files.
        while (iterator.hasNext()){
            String filePath = String.format("content_%d.html", index);
            File file = new File(filePath);

            System.out.println("Writing " + urls[index] + " to file...");

            try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
                String html = iterator.next();
                br.write(html);
                System.out.println("Success!\n");
            } catch (IOException e) {
                System.out.println("Failed.\n");
            } finally {
                index++;
            }
        }

        /* Note: We can use this to traverse using for-each loops also... 
        for (String html: urlLibrary) {
            ---- BODY IS SAME ----
        }    */

    }
}
