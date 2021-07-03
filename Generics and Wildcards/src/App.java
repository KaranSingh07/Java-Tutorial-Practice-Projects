import java.util.ArrayList;

class Machine {
    public String toString() {
        return "I am a Machine";
    }

    public void start() {
        System.out.println("Machine started.");
    }
}

class Camera extends Machine {
    public String toString() {
        return "I am a Camera";
    }

    public void start() {
        System.out.println("Camera started.");
    }

    public void snap() {
        System.out.println("Photo taken.");
    }
}

public class App {
    public static void main(String args[]) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("mango");
        fruits.add("cherry");

        System.out.println("My fruits are...");
        // Passing an ArrayList to a method as parameter.
        showList(fruits);

        // Now, lets use our Machine and Camera class objects
        //...... Case 1: Simplest case .........//
        ArrayList<Machine> machines = new ArrayList<>();

        machines.add(new Machine());
        machines.add(new Machine());
        //... Works fine ...//
        showMachines1(machines);

        //....... Case 2: Using Camera objects in ArrayList<Machine> and calling showMachines .........//
        ArrayList<Machine> machines2 = new ArrayList<>();

        machines2.add(new Camera());        // OK because Camera is indeed a Machine
        machines2.add(new Camera());
        //... Works fine ...//
        showMachines1(machines2);

        //....... Case 3: Using Camera objects in ArrayList<Camera> and calling showMachines .........//
        ArrayList<Camera> cameras = new ArrayList<>();

        cameras.add(new Camera());
        cameras.add(new Camera());

        //... ERROR (If that question mark syntax is removed) ...//
        showMachines1(cameras);

        /*
           Although Camera is a subclass of Machine, ArrayList<Camera> is not a subclass of ArrayList<Machine>.
           And, in general, the parameterized class formed by a class (Here ArrayList<Machine>) is not a parent class
           of parameterized class formed by its child class (Here ArrayList<Camera>).
           That's why it is an error.
           But, it is reasonable to do this, and indeed there is a way to do the same.
           Put a ? (Question mark) in the diamond operator of the method the formal parameters.

           Now change the loop also to type Object, that previously had for (Machine machine: machines) { ... }

           Now you can pass any type of ArrayList<> object to the method showMachines.
           Furthermore there is no need of showList for fruits also.

           !!.. Upper bound ..!! showMachines1(ArrayList<? extends Machine> list)
           -- In short: <? extends Machine> means ? is Machine or subtype (subclass) of Machine.

           But now you can't call the methods specific to an object of Machine or Camera.
           What if you want to do so?
           You can use a upper bound that specifies what classes you want to pass to the showMachines and want their
           specific methods.
           # Syntax : <? extends Machine>
           Just specify the Parent class and then to iterate over use:
                 for (Machine machine: list) { ... }
                 // Why Machine?
                    Because subclasses of Machine will definitely have methods of Machine (like toString())
                    Even if Camera have not overridden it, toString() will still be available.
           -------------------------------------------------

           !!.. Lower bound ..!! showMachines2(ArrayList<? super Camera> list)
           -- In short: <? super Camera> means ? is Camera or supertype (superclass) of Camera.

           Using upperbound you can call the methods available in Machine and Camera both.
           But, what if you want to call a method that is specific to Camera (like snap()).
           Then you use lower bound.
           # Syntax: <? super Camera>
           Just specify the Child class and then to iterate over use:
                for (Object obj: list) { ... }
                // Why Object?
                    Because superclasses of Camera not necessarily have methods of Camera (like snap())
         */
    }

    static void showList(ArrayList<String> fruits) {
        for (String fruit: fruits) {
            System.out.println(fruit);
        }
    }

    static void showMachines1(ArrayList<? extends Machine> list) {
        for (Machine machine: list) {
            System.out.println(machine);
            machine.start();
            // machine.snap() is Error, how to call Camera specific methods now?... see lower bounds.
        }
    }

    static void showMachines2(ArrayList<? super Camera> list) {
        for (Object object: list) {
            System.out.println(object);
            // object.snap() still an error, Still a confusion.
        }
    }

    /* Method if you don't use bounds mentioned above in the comments
      static void showMachines(ArrayList<?> list) {
        for (Object object: list) {
            System.out.println(object);
      }
    */
}
