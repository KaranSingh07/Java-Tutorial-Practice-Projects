package arrayofobjects;

import defaultpackage.Person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading array of objects...");
        String filePath = "array_persons.bin";

        try (FileInputStream fs = new FileInputStream(filePath)) {
            ObjectInputStream os = new ObjectInputStream(fs);

            Person[] persons = (Person[]) os.readObject();       // #1
            for(Person person: persons) {
                System.out.println(person);
            }

            os.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found in file: " + filePath);
        } catch (IOException e) {
            System.out.println("Error reading file: " + filePath);
        }

    }
}

// #1 Yes, casting should also be done in the form of arrays.
