public class App {

    public static void main(String[] args) {
        int a=5, b=5;
        System.out.println(a == a);

        String s1 = "Karan";
        String s2 = "Karan";

        System.out.println(s1 == s2);       // true because s1 and s2 are pointing to the same object

        String s3 = "Karan Singh".substring(0, 5);      // Value is Karan

        System.out.println(s1 == s3);       // false because s1 and s3 are pointing to different objects,
                                            // even though their values is same: "Karan"
        System.out.println(s1.equals(s3));  // Now it is true.

    }

 }

/*
* When we compare two objects using ==, Java just compares whether they are pointing to the same object or not.
* If so, == will result in true, and false otherwise.
* But suppose you want to use a different comparison strategy for two objects of the same class then how will
* you do this? The answer is implement a isEquals() method and define your own comparison strategy.
* And based on that return true or false.
*
* As an example, String should never be compared with == because many a times there may be two string references
* that will have same value but pointing to different objects, then == will return false.
*
* See App2 how to define equals() method for your own classes.
* */
