import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args){
        String[] fruitsArray = {"apple", "mango", "cherry", "orange", "pineapple", "banana"};
        List<String> fruits = new ArrayList<>(Arrays.asList(fruitsArray));

        System.out.print("Before sorting...\n\t" + fruits);

        // --- 1. By static method sort() in Collections class
        Collections.sort(fruits);
        System.out.print("\nAfter sorting...\n\t" + fruits);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 0, -4, 6));
        System.out.print("\nBefore sorting...\n\t" + numbers);

        Collections.sort(numbers);
        System.out.println("\nAfter sorting...\n\t" + numbers);
    }
}
