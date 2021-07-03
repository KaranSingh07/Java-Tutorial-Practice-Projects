import java.io.Serializable;

public class Person implements Serializable {
    private transient int id;       // transient means id will not be serialized now.
    private String name;
    private static String country;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void setCountry(String country) {
        Person.country = country;
    }

    public static String getCountry() {
        return Person.country;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name='" + name + "'] " + "Country: " + country;
    }

}
