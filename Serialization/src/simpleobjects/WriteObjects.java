package simpleobjects;

import defaultpackage.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

    public static void main (String[] args) {

        System.out.println("Writing objects...");
        String filePath = "persons.bin";

        Person harry = new Person(123, "Harry");
        Person hermoine = new Person(259, "Hermoine");
        System.out.println(harry);
        System.out.println(hermoine);

        try (FileOutputStream fs = new FileOutputStream(filePath)) {   // #1

            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(harry);
            os.writeObject(hermoine);
            System.out.println("Success!");

            os.close();                                                           // #2

        } catch (IOException e) {
            System.out.println("Unable to write to file: " + filePath);
        }

    }
}

// See Explanation.txt for about Serialization

/* #1 File can be of any type, but .bin is commonly used for binary data.
*     Using the Java 7+  style try-with-resources
*
*  FileOutputStream is a class used for writing to files, and ObjectOutputStream is a class used to write objects.
*  writeObjects() method writes the objects.
*
* #2 Not using the try-with-resources because if we do we will have to nest exceptions and that'll be ugly.
* */