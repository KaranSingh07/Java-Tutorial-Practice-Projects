import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing objects...");
        Person person = new Person(543, "Ron");
        Person.setCountry("India");

        String filePath = "persons.bin";

        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(filePath))) {

            os.writeObject(person);
            System.out.println("Success!");

        } catch (IOException e) {
            System.out.println("Unable to write into file: " + filePath);
        }
    }
}

/*
 * --- Transient keyword ---
 * While writing objects to file we necessarily do not require to write all the fields of object.
 * Many a times we only want to write select fields because others are not important to write or for any reason.
 * 'transient' keyword helps achieving this goal.
 *
 * --- How to? ---
 * Suppose we just want the name to be serialized and avoid the id field.
 * Just make the id field in the class transient by adding a transient keyword while declaring them in the class.
 * See the Person class.
 *
 * But remember, Java assigns default value to the fields, variable etc. So when we print the person object (it calls
 * toString()) and toString()'s implementation prints id field also. That's why we see id=0 as the output.
 *
 * --- Serializing static fields ---
 * Static variables belong to a class and not to any individual instance.
 * The concept of serialization is concerned with the object's current state.
 * Only data associated with a specific instance of a class is serialized, therefore static member fields are ignored
 * during serialization and it will also just waste memory if we save the same field over and over with every object.
 *
 * --- One more thing to be aware of ---
 * When we deserialize, the constructor wll not be called. The fields will set to the same value as they were
 * when serialization happened.
 * */