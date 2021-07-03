public class Car extends Vehicle {
    @Override
    public void accelerate() {
        System.out.print("\nCar is accelerating...");
    }

    @Override
    public void applyBreaks() {
        System.out.print("\nCar breaks applied.");
    }

    @Override
    public void takeTurn(String direction) {
        System.out.print("\nCar is turning in " + direction + "...");
    }

}
