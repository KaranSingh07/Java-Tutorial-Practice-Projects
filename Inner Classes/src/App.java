public class App {
    public static void main(String[] args) {
        Robot lisa = new Robot("Lisa");
        lisa.start();

        Robot.Chip chip = lisa.new Chip();  // Yes, the way to make objects of non static inner classes is little weird.
        chip.feedCode();

        Robot.Battery battery = new Robot.Battery();        // Just like normal classes
        battery.charge();
    }
}

/*
* --- Type-1: Non static inner classes ---
* Major use: Inner classes are used inside another class to model a object inside a class (like Brain inside Robot).
* We can also make objects of public/default inner classes directly in our App without the outer class.
* In short to group together some functionality.
*
* When you create an instance of a Robot, you do not automatically create an instance of inner classes,
* they should be created on its own explicitly, either inside the class itself (like Brain) or in Main (like Chip).
* It is much more common to use private inner classes.
*
* --- Type-2: Static inner classes ---
* Main use: Suppose you have a battery in Robot which is not charged, so you can use charged battery of another
* Robot into this Robot. To model this situation in code we use static inner classes whose objects can be passed
* to the same class's methods.
*
* The project on Iterator (Implementing iterable interface) inside collections demonstrate a very good use of
* inner classes.
*
* --- Type-3: Classes inside methods ---
* We can also do this. See the example inside the start() method.
* Access modifiers can't be used with them, the method's access modifier is applied.
 */

