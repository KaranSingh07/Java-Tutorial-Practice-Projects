import java.util.Scanner;

public abstract class Vehicle {
    public abstract void accelerate();
    public abstract void applyBreaks();
    public abstract void takeTurn(String direction);

    public void calibrate() {
        // Now this method can be called directly by object of Vehicle's implementing class. Because we have defined
        // the body of this method. However child classes can also override it if they want.
        System.out.print("\n\n---Calibration process started---");
        accelerate();       // *2.1
        applyBreaks();      // *2.2
        System.out.print("\n---Calibration process finished---\n");
        Scanner scanner = new Scanner(System.in);

    }
}



/*
* Abstract classes are something which forces other classes to implement must have methods, just like interfaces.
* For example, suppose we want to create a class Car, or Truck, then both of these must implement accelerate(),
* applyBrakes() and takeTurn() methods in order to give a minimum functionality. Without these three methods, a Car or
* Truck is not possible.
* So the work of Abstract class is to force other classes to implement must have methods.
*
* The word Abstract means a blueprint, or a theoretical concept on which practical things can be made.
* A vehicle is just a concept, we can think like something which have ability to accelerate, applying brakes,
* taking turn etc, practically it is nothing. However with the help of this concept Cars, Trucks and all other vehicles
* can be constructed practically and those will have features defined in the Vehicle concept.
*
* That's exactly how abstract classes work. (See the doTrip() method)
*
* Abstract classes can also have non-abstract methods.
*
* The classes using this concept (by extending the abstract classes) must implement all the methods.
* Otherwise can be declared abstract if they're also a concept that is using another parent concept.
*
* --- *2.1 and *2.1 ---
* Which accelerate() and applyBreaks() methods will be called will be based on the calling object.
* If it is a type of Car, then Car's accelerate() and applyBraks() will be called.
* Similar thing applies for Truck also.
*
*
* --- Difference between Interface and Abstract Classes ---
*
*    -> Abstract class is a very strong statement that a child class depends on it. Whereas Interface is weaker.
*    -> A class can IMPLEMENT any number of Interfaces, but it can only EXTEND one abstract class. That's why it is
*       more stronger statement that "Car IS a Vehicle" for example.
*    -> Interface do not provide any default functionality, in other words all the methods of Interface are abstract,
*       whereas Abstract classes may provide default functionality, (meaning they can have non abstract methods.)
*       like the calibrate() in our Vehicle class.
*
* */
