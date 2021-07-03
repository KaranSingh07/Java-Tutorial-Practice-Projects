public class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating...");
    }

    @Override
    public void apply_breaks() {
        System.out.println("Car breaks applied.");
    }

    public void carry_people() {
        System.out.println("People carried in Car");
    }
}
