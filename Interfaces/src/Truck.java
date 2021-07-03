public class Truck implements Vehicle{
    @Override
    public void accelerate() {
        System.out.println("Truck is accelerating...");
    }

    @Override
    public void apply_breaks() {
        System.out.println("Truck breaks applied.");
    }

    public void carry_goods() {
        System.out.println("Good carried in Truck.");
    }
}
