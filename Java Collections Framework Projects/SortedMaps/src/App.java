import java.util.*;

public class App {
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();                 // HashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();     // Linked list like structure
        Map<String, Integer> treeMap = new TreeMap<>();                 // Tree like structure

        System.out.print("HashMap (Unordered even it seems in this less data)...");
        testMap(hashMap);
        System.out.println("\n--------------");

        System.out.print("LinkedHashMaps (Ordered by the sequence of addition of elements)...");
        testMap(linkedHashMap);
        System.out.println("\n--------------");

        System.out.print("TreeMap (Ordered by keys)...");
        testMap(treeMap);
        System.out.println("\n--------------");
    }

    public static void testMap(Map<String, Integer> map) {
        map.put("Apple", 80);
        map.put("Orange", 30);
        map.put("Pomegranate", 130);
        map.put("Cherry", 150);
        map.put("Pineapple", 70);
        map.put("Banana", 30);
        map.put("Blackberry", 90);
        map.put("Mango", 50);

        // Another way of iterating maps with keySet()...
        for (String key: map.keySet()) {
            Integer value = map.get(key);
            System.out.printf("\n%-15s: %d", key, value);
        }
    }
}
