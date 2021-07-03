public class App {
    public static void main(String[] args) {

        App app = new App();        // Very common way to start an app, now app can call non static methods also

        // -----------------------------------------------
        // Passing primitive types

        int value = 7;
        System.out.println("1. Value is: " + value);

        app.show(value);

        System.out.println("4. Value is: " + value);        // Change in the method doesn't affect here

        // -------------------------------------------------
        // Passing non primitive types
        System.out.println();

        Person person = new Person("Professor Dumbledore");
        System.out.println("1. Person is: " + person);
        app.show(person);

        System.out.println("4. Person is: " + person);      // Change in the method doesn't affect here
    }

    public void show(int value) {
        System.out.println("2. Value is: " + value);
        value = 8;
        System.out.println("3. Value is: " + value);
    }

    public void show(Person person) {                       // Method overloading
        System.out.println("2. Person is: " + person);

        person.setName("Harry Potter");                     // #1. Original is changing

        person = new Person("Sirius Black");

        System.out.println("3. Person is: " + person);
    }
}

/*
 * Java only have pass by value, so changing the value of primitive or non primitive types doesn't affect the
 * original value. In both of the methods, the value variable and person reference are just a copy of the original
 * value and person. They're not the actual parameter and that's why changing them doesn't
 * affect the original parameter.
 *
 * But At #1, person is pointing to the Professor Dumbledore, that's why calling setName on it will change in the
 * original reference. The reason is
 * But, if we first do this...
 *   person = new Person("Sirius Black")
 *   person.setName("Harry Potter")
 * then the object that will get affected will be the newer one we just creating in show(), not the original
 *
 * So, the key point with non primitive types is, when we pass them to methods, initially they will point to the
 * same object in memory as the original was pointing to. That's why calling setName() for instance will affect the
 * original object. But if we create a new object (like Sirius Black) then the reference in method point to the
 * new object and now calling setName() will only affect the method's object, not the original one.
 */