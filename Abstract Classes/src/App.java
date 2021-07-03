public class App {
    public static void main(String[] args) {

        Car car = new Car();
        car.accelerate();
        car.takeTurn("Left");
        car.applyBreaks();
        car.calibrate();

        // Vehicle vehicle = new Vehicle(); Illegal: Vehicle is nothing in practical.
        // But we can use anonymous classes...
        Vehicle truck = new Vehicle() {
            @Override
            public void accelerate() {
                System.out.print("\nTruck is accelerating...");
            }

            @Override
            public void applyBreaks() {
                System.out.print("\nTruck breaks applied.");
            }

            @Override
            public void takeTurn(String direction) {
                System.out.print("\nTruck is turning in " + direction + "...");
            }
        };

        truck.accelerate();
        truck.takeTurn("Right");
        truck.applyBreaks();
        truck.calibrate();

    }
}
