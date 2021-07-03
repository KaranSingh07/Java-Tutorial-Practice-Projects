package defaultpackage;

public class Machine {
    private String name;        // This can't be accessed from Car (Its subclass)
    protected String material;  // This can be accessed from Car

    public Machine(String material) {
        this.material = material;
    }

    public String toString() {
        return "I'm a Machine build with " + material + ".";
    }

    public void start() {
        System.out.println("Machine Started.");
    }

    public void stop() {
        System.out.println("Machine Stopped.");
    }
}
