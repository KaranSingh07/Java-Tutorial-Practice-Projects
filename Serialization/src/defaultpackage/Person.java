package defaultpackage;

import java.io.Serializable;

public class Person implements Serializable {        // #1
    private final int id;
    private final String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [" + "id=" + id + ", name='" + name + '\'' + ']';
    }
}

// If we want to serialize objects, the class must be made serializable by implementing the Serializable interface.
// It doesn't contain any methods, it just indicates Java that this class is serializable.
