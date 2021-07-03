class CustomClosable implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("--Resources closed.--");
    }

    public void run() {
        System.out.println("Method running using resources...");
    }
}

public class Explanation {
    public static void main(String[] args) {

        try(CustomClosable customClosable = new CustomClosable()) {
            customClosable.run();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

/*
* AutoCloseable is an interface which have only one method close().
* For whatever class we want to implement Try With Resources, We can implement this interface and override
* the close() method.
* And just see the magic... close() will automatically be called at the end of the Try With Resources body.
* */
