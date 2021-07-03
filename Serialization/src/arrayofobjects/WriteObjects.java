package arrayofobjects;

import defaultpackage.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

    public static void main(String[] args) {
        System.out.println("Writing array of objects...");
        Person[] persons = {new Person(1, "Mike"),
                new Person(2, "James"),
                new Person(3, "Robin"),
                new Person(4, "Henry")};

        String filePath = "array_persons.bin";

        try(FileOutputStream fs = new FileOutputStream(filePath)) {

            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(persons);

            System.out.println("Success!");
            os.close();

        } catch(IOException e) {
            System.out.println("Error reading file: " + filePath);
        }
    }
}
