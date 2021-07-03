public class App {

    /*
    public static final int DOG = 0;
    public static final int CAT = 1;
    public static final int MOUSE = 2;
     */

    public static void main(String[] args) {
        Animal animal = Animal.DOG;

        switch (animal) {
            // Enhanced switch that do not require break to break.
            case DOG -> System.out.println("Dog");
            case CAT -> System.out.println("Cat");
            case MOUSE -> System.out.println("Mouse");
        }

        System.out.println(Animal.CAT.getClass());

        System.out.println(Animal.DOG instanceof Animal);

        System.out.println(Animal.DOG instanceof Enum);    // Enum is ultimate parent

        System.out.println(Animal.CAT.getName());          // Tom
        // method to get enum name as a string (like "DOG")
        System.out.println(Animal.MOUSE.name());           // MOUSE
        // reverse of the above (get string as enum name)
        System.out.println(Animal.valueOf("DOG"));         //
    }
}

/*
* Enum types are used in representing constant that relates to a fixed value like color codes, or animal codes.
* We can use enum to eliminate magic numbers in our code
* Defining all of them individually will be tedious and have problems. So to the rescue are Enum types.
*
* Syntax for creating Enum is like classes or interfaces.
* public enum ... {...}
* */
