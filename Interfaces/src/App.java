/* About the project:
* Suppose I have classes which MUST implement some methods to give a minimal functionality.
* So to enforce them to implement those methods, we create Interfaces which lists the signature of methods that
* must be implemented by those classes.
* So here we have two classes: 1.) Car and 2.) Truck. Both must implement accelerate() and apply_break()
* methods to give a minimum functionality. So we define them in a interface called Vehicle.
* NOTE: Methods are abstract means they don't have body, they just have the signature.
*
* After adding implements statement in Car and Truck classes, they both must implement methods defined in Vehicle.
* */

public class App {
    public static void main(String args[]) {
        Truck truck1 = new Truck();
        Car car1 = new Car();

        truck1.accelerate();
        car1.accelerate();
        truck1.apply_breaks();
        car1.apply_breaks();

        // We can't directly make objects from Interfaces (generally) because they don't have anything which
        // we can allocate to memory, instead we can do this...
        Vehicle vehicle1 = new Truck();
        // Because Truck is implementing all the methods of Vehicle, now vehicle1 can be a object of type Vehicle
        // pointing to Truck.
        vehicle1.accelerate();     // Call accelerate() of Truck
        vehicle1.apply_breaks();   // Call apply_breaks() of Truck
        // vehicle1.carry_goods(); ERROR because vehicle1 is a type of Vehicle and memory is only allocated for
        // methods that are defined in Vehicle (however implemented inside Truck)

        // Same goes with Car...
        Vehicle vehicle2 = new Car();
        vehicle2.accelerate();     // Call accelerate of Car
        vehicle2.apply_breaks();   // Call apply_breaks() of Car
        // vehicle2.carry_people(); ERROR

        /* ------------------------------------ */
        // If a method (like drive, below) taking argument of type Interface (here Vehicle), then any object of
        // the classes which implements that interface can be passed to that method as arguments.
        drive(car1);
        drive(truck1);
    }

    private static void drive(Vehicle vehicle) {
        // We can access methods defined in the interface Vehicle, and the impletation called will be based on
        // the object which is passed as an argument.
        vehicle.accelerate();
        vehicle.apply_breaks();
    }
}
