// First example: ArithmeticException

package unchecked_exceptions;

import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        try {
            double c = a/(double)b;
            System.out.printf("Division %d/%d is: %f\n", a, b, c);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero.");
        }
    }
}

/*
* The Exceptions for which compiler do not force the programmer to handle them are called unchecked exceptions.
* All the others are checked exceptions that must be handled by either try-catch blocks or declaring them in
* method signature. They are demonstrated in the other two packages of this project.
*
* Now talking abound unchecked exceptions, they are also called Runtime Exceptions and are in fact subclasses of
* RuntimeException class.
* If such exception occurs then there is no way to recover from it. The only way is to fix the underlying code.
* For Example: NullPointerException, ArrayIndexOutOfBoundsExceptions, ArithmeticExceptions.
* Although compiler will not force you to handle them, but still you can. But this is a bad practice and leaves
* loopholes in the code.
* */
