import java.util.*;

class Person {
    private int id;
    private String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() { return id + ": " + name; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class UsingCustomObjects {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Mike");
        Person p2 = new Person(2, "Henry");
        Person p3 = new Person(3, "Bob");
        Person p4 = new Person(1, "Mike");  //  Duplicate Mike

        Set<Person> persons = new HashSet<>();
        persons.add(p1);                    // Underscore just increases readability of integers
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);                    // #1.

        System.out.println(persons);

    }

}

/*
 * Set elements as we know are unique so we require a .equals() method to define equality of our objects.
 * And as we know, implementing .equals() requires implementation of hashCode() also.
 *
 * #1. --- If .equals() and hashCode() are not present ---
 *   If we do not implement .equals() and hashCode() then the compiler will only differentiate items in terms
 *   of memory addresses regardless of id and name of the person and that's why two entries of Mike is allowed.
 *   If we want that our objects are compared by means of id and name, then we have to implement the two methods
 *   and then only the items will get actually same and will not be added to the Set.
 * */
