import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        HashMap<String, Integer> fruit_prices = new HashMap<>();                    // Fruit name - Price

        fruit_prices.put("Apple", 80);
        fruit_prices.put("Mango", 50);
        fruit_prices.put("Strawberry", 140);

        System.out.println(fruit_prices);                                           // #1.

        System.out.println("Price of Apple: " + fruit_prices.get("Apple"));
        System.out.println("Price of Banana: " + fruit_prices.get("Banana"));       // #2.

        fruit_prices.put("Apple", 90);
        System.out.println("New price of Apple: " + fruit_prices.get("Apple"));     // #3.

        System.out.println("\n--- Iterating HashMaps ---");
        for (Map.Entry<String, Integer> entry : fruit_prices.entrySet()) {          // #4. Iterating
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.printf("%-15s: %d\n", key, value);
        }
    }
}

/*
 * - HashMap is a key value pair type data structure similar to dictionaries in python.
 * We can have any object as keys and values, but one thing to watch here is that if we want to use our custom
 * objects as keys, then they must implement hashCode() and .equals() methods.
 *
 * - HashMaps are not ordered (or sorted), so the order is completely random.
 *
 * #1.
 *   Directly printing the HashMaps will result exactly same as python's dictionaries.
 *
 * #2.
 *   If we try to get a key which doesn't exists, this is not an error. It will return null
 *
 * #3.
 *   Keys are unique in HashMaps that's why if we try to put a key-value pair such that the key already exists,
 *   then the value will just be overwritten.
 *
 * #4. Iterating
 *   The normal for each loop is not applicable to HashMaps and we'll have to use a special syntax like above.
 * */
