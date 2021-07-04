import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeHashSet = new TreeSet<>();
        Set<Integer> treeHashSetIntegers = new TreeSet<>();

        System.out.println("HashSet (Unordered, prevent duplicates)...");
        addStrings(hashSet);
        display(hashSet);

        System.out.println("\n\nLinkedHashSet (Ordered by addition of items, prevent duplicates)...");
        addStrings(linkedHashSet);
        display(linkedHashSet);

        System.out.println("\n\nTreeSet (Natural alphabetical ordered, prevent duplicates)...");
        addStrings(treeHashSet);
        display(treeHashSet);

        System.out.println("\n\nTreeSet of Integers (Natural increasing ordered, prevent duplicates)...");
        addIntegers(treeHashSetIntegers);
        display(treeHashSetIntegers);

        // --- Does set contains some item
        System.out.println("\n");
        System.out.println(hashSet.contains("cat"));
        System.out.println(hashSet.contains("lion"));

    }

    public static void addStrings(Set<String> set) {
        set.add("dog");
        set.add("cat");
        set.add("mouse");
        set.add("elephant");
        set.add("rabbit");
        set.add("dog");             // Adding duplicate items does nothing

    }

    public static void addIntegers(Set<Integer> set) {
        set.add(5);
        set.add(10);
        set.add(-13);
        set.add(0);
        set.add(143);
        set.add(903);
        set.add(10);
        set.add(-23);

    }

    public static <E> void display(Set<E> set) {
        // Iterating over a set... (Using E types so that both String and Integer set)
        for (E e : set) {
            System.out.print(e + "   ");
        }

    }
}

/*
 * - Set is an interface in Java Collections Framework just like List and Map. Following classes implements it...
 *   1.) HashSet is unordered.
 *   2.) LinkedHashSet is ordered by addition of items.
 *   3.) TreeSet is natural ordered.
 *       - For string: alphabetical order
 *       - For integers: increasing order
 *
 * - See Operations for mathematical operations on sets.
 * */
