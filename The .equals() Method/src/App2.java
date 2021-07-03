import java.util.Objects;

class Fruit {
    private final String color;
    private final String name;

    Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getFruit() {
        return name + " is a fruit whose color is " + color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return color.equals(fruit.color) && name.equals(fruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, name);
    }
}

public class App2 {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit( "Apple", "Red");
        Fruit fruit2 = new Fruit( "Apple", "Red");

        System.out.println(fruit1 == fruit2);       // false because they're pointing at different objects.

        System.out.println(fruit1.equals(fruit2));  // true

    }
}

/*
* Suppose we want to compare two fruits and return true if their name and color are same even they are two different
* objects in memory. And this is practically true also.
*
* About hashCode():
* It is a method defined in the Object class which is grandparent for all classes. It generates unique
* ids for every objects and must be overridden and implemented if you want to implement .equals()
*
* */
