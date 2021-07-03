package simpleobjects;

import defaultpackage.Person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {
    public static void main(String[] args) {

        System.out.println("Reading objects...");
        String filePath = "persons.bin";

        try(FileInputStream fi = new FileInputStream(filePath)) {

            ObjectInputStream os = new ObjectInputStream(fi);

            Person person1 = (Person)os.readObject();               // #1
            Person person2 = (Person)os.readObject();

            System.out.println(person1);
            System.out.println(person2);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } catch (ClassNotFoundException e) {
            System.out.println("Object not found in the file: " + filePath);
        } catch (IOException e) {
            System.out.println("Error reading file: " + filePath);
        }

    }
}

/*
* Classes and methods for reading are similar to that of writing the objects.
*
* #1
*   .readObjects() method returns the object of type Grandparent (Object) so we have to cast them to whatever type
*   we want (here defaultpackage.Person).
* */
