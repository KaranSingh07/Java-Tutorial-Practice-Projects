import java.util.HashSet;
import java.util.Set;

public class Operations {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        App.addStrings(set1);                       // Using App's addStrings() method

        Set<String> set2 = new HashSet<>();
        set2.add("dog");
        set2.add("cat");
        set2.add("lion");

        System.out.print("Set A: " + set1);
        System.out.print("\nSet B: " + set2);

        // 1.) --- Intersection ---
        Set<String> intersection = new HashSet<>(set1);    // Creating copy of set1
        intersection.retainAll(set2);                      // And now retaining elements of set2 means intersection
        System.out.print("\nIntersection: " + intersection);

        // 2.) --- Union ---
        Set<String> union = new HashSet<>(set1);           // Creating copy of set1
        union.addAll(set2);                                // And now adding elements of set2 means difference
        System.out.print("\nUnion: " + union);

        // 3.) --- Difference ---
        Set<String> difference = new HashSet<>(set1);      // Creating copy of set1
        difference.removeAll(set2);                        // And now removing elements of set2 means difference
        System.out.print("\nDifference A-B: " + difference);

    }
}
