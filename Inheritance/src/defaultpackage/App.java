package defaultpackage;

class App {
    public static void main(String[] args) {
        System.out.println("Hello");

        // Creating object of a class of the same package...
        Machine machine1 = new Machine("Steel");
        System.out.println(machine1);
        machine1.start();
        machine1.stop();

        // Again the same thing (But Car is inheriting Machine class)...
        Car car1 = new Car("Iron");
        car1.start();       // Calling the overridden method
        car1.stop();        // Calling the inherited method
        car1.takeTurn();    // Calling method only available in Car
        car1.showInfo();
    }
}