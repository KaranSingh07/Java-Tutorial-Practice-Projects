package defaultpackage;

public class Car extends Machine {           // Extending (inheriting) a class of same package
    public Car(String material) {
        super(material);
    }

    // start() method overridden by Car
    @Override               // Must override if this is placed
    public void start() {
        super.start();      // Calling the start() of parent class using super keyword and dot(.)
        System.out.println("Car started.");
    }

    public void takeTurn() {
        System.out.println("Taking turn...");
    }

    public void showInfo() {
        // System.out.println(name);   // Error: name not available here because it is private member of Machine
        System.out.println("I'm a Car made with " + material + ".");
    }
}
