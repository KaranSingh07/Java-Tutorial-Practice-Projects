class Machine {
    public void start() {
        System.out.println("Machine starting...");
    }
}

public class App {
    public static void main(String args[]) {
        // Normal object
        Machine machine1 = new Machine();

        // Anonymous class object*
        Machine machine2 = new Machine() {
            @Override
            public void start() {
                System.out.println("Camera snapping...");
            }
        };

        System.out.println(machine1);
        machine1.start();

        System.out.println(machine2);
        machine2.start();
    }
}

/*
 * If we want to override some methods of an existing class for a very few objects, instead of creating another whole
 * child class that extends the parent class, we can use anonymous classes.
 * The concept is, while creating the object just give it a curly braces scope like the above and specify which methods
 * you want to override. Now the machine2 object will point to a new child class of Machine instead of Machine.
 * Hence we have not defined any child class here as we do generally, but it still exists and thus it is called
 * Anonymous class.
 *
 * Anonymous classes can not only be made using a class like above, but they can be made by interfaces.
 * See App2 for anonymous class for interface.
 * */
