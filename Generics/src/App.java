import java.util.ArrayList;
import java.util.HashMap;

class Robot {
    private String name;
    public Robot(String name) {
        this.name = name;
    }
    public void speak() {
        System.out.println("Hi, My name is " + this.name + ".");
    }
}

public class App {
    public static void main(String args[]) {
        /* Generic classes are those which can work with other type of objects that you specify.
           For example, the ArrayList class which can store a list of any type of object.
           It can be Integer, String or even object of your own class.
           These are also called parameterized classes.
        */

        //................ Old way (Before Java 5) ................//
        ArrayList list = new ArrayList();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add(3);

        String fruit = (String)list.get(1); // Because list.get() returns a type Object and we have to downcast it.
        System.out.println(fruit);
        int num = (int)list.get(3);
        System.out.println(num);

        //................ Now using generics (After Java 5) ................//
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("mice");

        String animal = animals.get(1);   // Now get() will return String, No need to cast.
        System.out.println(animal);

        // To iterate:
        for (String animal_: animals) {
            System.out.println(animal_);
        }

        //................ After Java 7, even the latter specification is also optional ................//
        ArrayList<Integer> numbers = new ArrayList<>();

        //................ You can also pass your own type object ................//
        ArrayList<Robot> robots = new ArrayList<>();
        robots.add(new Robot("Lisa"));
        robots.add(new Robot("Jimmy"));
        robots.add(new Robot("Swanny"));

        for (Robot robot: robots) {
            robot.speak();
        }

        //................ There are also classes that take more than one type ................//
        HashMap<Integer, String> color_codes = new HashMap<>();      // Just like a Python Dictionary
        color_codes.put(0, "BLACK");
        color_codes.put(1, "WHITE");
        color_codes.put(2, "RED");
        color_codes.put(3, "GREEN");
        color_codes.put(4, "BLUE");
        color_codes.put(3, "ORANGE");       // This will overwrite key 3.

        System.out.println(color_codes.get(3));

        // Note: <> This is called diamond operator
    }
}
