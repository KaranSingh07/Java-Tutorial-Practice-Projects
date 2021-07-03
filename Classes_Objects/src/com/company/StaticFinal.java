// Demonstrate static and final keywords

package com.company;

class Product{
    private static final String BRAND = "Dell";    // Constant (Or final): Can't be reassigned, and static also
                                                   // Must be assigned at the time of definition of final variables
    private static int number_of_products = 0;     // Shared among all the objects of the class, called with class name
    private String name;                           // Instance variable

    public Product(String name){        // Instance method can access static data
        number_of_products++;
        System.out.println(String.format("Product %d made: %s", number_of_products, name));
        this.name = name;
    }

    public static int getNumber_of_products(){
        return number_of_products;
        // System.out.println(name); Error: Static methods can't access instance data
    }

    public static String getBrand(){
        return BRAND;
    }

    public String getName(){
        return name;
    }
}

public class StaticFinal {
    public static void main(String args[]) {
        Product tv = new Product("TV");
        Product keyboard = new Product("Keyboard");
        Product smartphone = new Product("Smartphone");

        System.out.println("Total number of products made: " + Product.getNumber_of_products());
        System.out.println("Brand: " + Product.getBrand());
    }
}
