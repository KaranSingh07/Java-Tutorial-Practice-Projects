import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();

        calculateTimings(arrayList, "ArrayList");
        calculateTimings(linkedList, "LinkedList");

    }

    private static void calculateTimings(List<Integer> list, String type) {
        // adding initial items
        for (int i=0; i<1E5; i++) {
            list.add(i);
        }

        long startTime = System.currentTimeMillis();

        /*
        // adding items at end (LinkedList is slightly slower)
        for (int i=0; i<1E5; i++) {
            list.add(i);
        } */

        // adding items at beginning (ArrayList is very very very slower)
        for (int i=0; i<1E5; i++) {
            list.add(0, i);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken: " + (endTime - startTime) + " ms for " + type);
    }
}

/*
 * If you want to add or remove items from only the end, use ArrayList, it is slightly faster.
 * But, if you often want to add/remove items from in-between or beginning or even near to end use LinkedList.
 * LinkedList because of the implementation didn't require shifting of elements, so it is very much faster than
 * ArrayList in insertion/deletion.
 * On the other hand, if you want to search or access elements quite often, use ArrayList because it is very much
 * faster when it comes to accessing speed.
 *
 * Note: Java actually uses doubly linked list.
 * */
