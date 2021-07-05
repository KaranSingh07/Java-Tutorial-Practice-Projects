import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {
    public static void main(String[] args) {
        // First set of methods: add(), element(), remove()
        System.out.println("------------------ Using first set of methods ------------------");
        Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);

        try {
            System.out.println("Head of the queue: " + q1.element());   // Will throw exception
        } catch (NoSuchElementException e) {
            System.out.println("No element exists.");
        }

        try {
            q1.add(10);
            q1.add(20);
            q1.add(30);
            q1.add(40);     // #1.
        } catch (IllegalStateException e) {
            System.out.println("Can't add item. Queue reached maximum capacity 3.");
        }

        System.out.println("Head of the queue: " + q1.element());       // Will return head

        System.out.print("Queue: ");
        display(q1);
        System.out.println();

        try {
            System.out.println("Removed value: " + q1.remove());        // #2.
            System.out.println("Removed value: " + q1.remove());
            System.out.println("Removed value: " + q1.remove());
            System.out.println("Removed value: " + q1.remove());        // #3. Self explanatory remove
        } catch (NoSuchElementException e) {
            System.out.println("Can't remove item. Queue is empty.");
        }

        //-----------------------------------------------------------------------------------//
        // Other set of methods:
        System.out.println("------------------ Using second set of methods ------------------");
        Queue<Integer> q2 = new ArrayBlockingQueue<>(3);
        q2.offer(10);
        q2.offer(20);
        q2.offer(30);
        q2.offer(40);                                               // #3.

        System.out.print("Queue: ");
        display(q2);
        System.out.println("\nHead of the queue: " + q2.peek());

        System.out.println("Removed value: " + q2.poll());
        System.out.println("Removed value: " + q2.poll());
        System.out.println("Removed value: " + q2.poll());
        System.out.println("Removed value: " + q2.poll());            // #4.

        System.out.println("Head of the queue: " + q2.peek());        // #5.

    }

    public static void display(Queue<Integer> queue) {
        for (Integer value : queue) {
            System.out.print(value + "  ");
        }
    }
}

/* QUEUES
 * It is FIFO based data structure.
 * Queue is an interface in Java and many classes implements it, some of them are LinkedList, ArrayBlockingQueue.
 * LinkedList:
 *      Can have any size (till your memory gets overflowed, of course).
 * ArrayBlockingQueue:
 *      Have fixed maximum capacity.
 *
 * #1.
 *      Trying to add 4 items instead of maximum capacity results in unchecked exception (i.e. add() method do not
 *      force you to handle it. But we'll handle it.
 *
 * #2.
 *      Removes the head (first item added).
 *
 * #3. Replacement of add(): offer()
 *      No error using offer() if we exceed the capacity.
 *      It'll return true and false based on the success of the operation.
 *
 * #4. Replacement of remove(): poll()
 *      Same goes with poll() but return null.
 *
 * #5. Replacement of element(): peek()
 *      Same goes with peek() but returns null.
 *
 * Note: BlockingQueue class also implements queue and it have methods that can also support what happens when
 * timeout of an operation happens. It is used in Multithreading applications.
 */