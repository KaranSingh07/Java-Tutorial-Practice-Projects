import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading objects...");
        String filePath = "persons.bin";

        try (ObjectInputStream os = new ObjectInputStream(new FileInputStream(filePath))) {

            Person person = (Person) os.readObject();
            System.out.println(person);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found in file: " + filePath);
        } catch (IOException e) {
            System.out.println("Unable to read from file: " + filePath);
            e.printStackTrace();
        }
    }
}
