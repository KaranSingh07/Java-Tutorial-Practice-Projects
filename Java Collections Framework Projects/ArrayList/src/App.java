import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(); // #1

        // Adding items
        numbers.add(12);
        numbers.add(18);
        numbers.add(-3);

        // Retrieving items
        System.out.println(numbers.get(0));

        // Iterating #1
        System.out.println("\nIteration #1: ");
        for (int i=0; i<numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // Removing (from behind is very fast) [Be CAREFUL]
        numbers.remove(numbers.size() - 1);

        // Removing (from beginning is very slow is list is very long. #2
        numbers.remove(0);

        // Iteration #2
        System.out.println("\nIteration #2: ");
        for (Integer number: numbers) {
            System.out.println(number);
        }

        // #3 List interface
        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("\nFruits...");
        for (String fruit: fruits) {
            System.out.println(fruit);
        }
    }
}

/*
* #1
* We can only use object types, not primitive types.
* int, float etc are not valid, use Integer, Float etc
* We can use any object, even our own class type object.
*
* #2
* The reason why removing the elements of starting indices is slower is the way ArrayList is implemented.
* It is indeed using java arrays behind the scenes and that's why if we remove any element, all the elements
* after that element will be shifted one position ahead.
*
* #3
* ArrayList (and LinkedList also) implements List interface and that's why a reference of type List (like fruits)
* can point to any class object which implements the List interface.
* Remember, List is just an interface so we can't make objects from it, we always make objects of the classes
* implementing the interface.
* */
