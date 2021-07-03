public class App {

    public static void main(String args[]) {

        Device device1 = new Device();
        Camera camera1 = new Camera();

        device1.start();
        camera1.start();            // Refers to Camera's start() (it overrides the same of its parent Device)
        camera1.snap();

        // 1. Upcasting
        System.out.println("Upcasting results...");
        Device device2 = camera1;   // Or Device device2 = new Camera();
        device2.start();            // Refers to Camera's start()
        /*
            device2.snap();          // Error, Reason...
            Error because camera is a reference of type Camera although its pointing to Device object
            The methods which can be called by camera variable (or reference) will be determined by
            its reference type (which is Camera) and the implementation that will be called for that method name
            will be determined by Object type (which is Device).

            Parent p1 = new Child();
            Similarly, the methods which can be called by p1 are only those which are available in Parent class,
            Whereas, which implementation will be called for that method will be based on Child().
            In other words, only the methods available in Parent class can be called by p1, and if there are some methods
            which are overridden by Child class then the Child class implementation will execute, otherwise Parent
            class implementation will execute.
        */

        // 2. Downcasting
        System.out.println("Downcasting results...");
        Device device3 = new Camera();
        Camera camera2 = (Camera)device3;
        camera2.start();
        camera2.snap();
        /*
            Without this casting, Java will give error because it wants confirmation that we really
            want to downcast the reference device3 which was previously a Device type, and now will
            be a Camera type.
        */

        // 3. Erroneous case
        Device device4 = new Device();
        // Camera camera3 = (Camera)device4();
        /*
            This is not permissible casting.
            In downcasting device3 initially pointed to a Camera object, so Camera specific implementation snap()
            is available for running from it (although they can't be called yet). But in future if it is
            casted to Camera, and it is, the implementations of methods of Camera, snap(), can be called.

            But in this case, device4 is initially a Device object, so only the methods of Device class
            will be available for running. Now if you try to cast it to Camera type, then how will the
            implementation of snap() method will execute because it was never available in Device.
        */
    }
}
