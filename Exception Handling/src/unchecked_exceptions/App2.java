// Second example: ArrayIndexOutOfBoundsException

package unchecked_exceptions;

public class App2 {
    public static void main(String args[]) {

        String[] fruits = {"Apple", "Banana", "Cherry"};

        try {
            System.out.println(fruits[3]);
        } catch (RuntimeException e) {              // *
            System.out.println("Exception fetching fruits.");
        }
    }
}

/*
* Remember: according to the concept of polymorphism, we can catch any exception which is subclass of any class
* inside the catch block catching the parent class.
* As we know, RuntimeException is parent class of all RuntimeExceptions, this catch block will catch the
* ArrayIndexOutOfBoundsException.
* */
