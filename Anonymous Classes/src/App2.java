interface IPlant {
    void grow();
}

public class App2 {
    public static void main(String[] args) {
        IPlant plant1 = new IPlant() {
            @Override
            public void grow() {
                System.out.println("Plant is growing...");
            }
        };

        System.out.println(plant1);
        plant1.grow();
    }
}

/*
 * Instead of creating a whole class that implements the methods of IPlant interface, we can use Anonymous class
 * while creating objects just like App's objects of Machine.
 * */
