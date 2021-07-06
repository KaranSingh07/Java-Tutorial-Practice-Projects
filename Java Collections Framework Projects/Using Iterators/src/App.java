import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>(Arrays.asList(
                "dog", "cat", "rabbit", "lion"));

        /* General way of iterating (Java 5+)...
        for (String animal: animals) {
            System.out.println(animal);
        }   */

        // Using Iterators...
        Iterator<String> iterator = animals.iterator();

        while (iterator.hasNext()) {
            String animal = iterator.next();
            if(animal.equals("cat")) {
                iterator.remove();
            } else {
                System.out.println(animal);
            }
        }

    }
}

/*
 * Java Iterable Interface...
 * Whatever class wants the functionality of iterating through its elements, have to implement the Iterable
 * interface. LinkedList and all the other collections in general implements it already.
 * You just have to call iterator() method on the collections (animal here) and it will return an object
 * of Iterator class which you have to store in a reference and use. Iterator is also a parameterized class
 * (or template type) so just specify the type here.
 *
 * It have following 3 methods:
 * 1.) next(): Returns the next element. Throws and NoSuchElementException if all elements are traversed.
 *         elements are not removed, they're only returned one by one.
 *
 * 2.) hasNext(): It is used to check if next() will return an element or throw exceptions. Means all whether or not
 *         all elements are traversed.
 * - Note: both these methods are generally used simultaneously in a loop to prevent next() to throw exception.
 *
 * 3.) remove(): Removes the next element from the list.
 *-----------------------------------------------------------------
 * - IMPORTANT NOTE: We can't remove items in a for each loop. That will throw a ConcurrentModificationException
 *   because we're not allowed to modify the list currently being used by loop.
 *   BUT, for each loop behind the scenes uses iterators.
 *
 * -- If you want to use iterator for Lists, you can use ListIterator that also have add(), hasPrevious(), next(),
 *    previous(), previousIndex(), set() etc more very useful methods.
 */
