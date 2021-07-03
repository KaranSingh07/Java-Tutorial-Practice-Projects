package otherbuilding;

import building.House;

class Home extends House {
    public void printInfo() {
        System.out.println("-----Accessing in other package subclass-----");
        System.out.println(public_str);
        System.out.println(protected_str);
        // System.out.println(private_str);     ERROR
        // System.out.println(default_str);     ERROR
        System.out.println("-------------------");
    }
}

public class App {
    public static void main(String args[]) {
        House house1 = new House();

        System.out.println("-----Accessing in other package non-subclass-----");
        System.out.println(house1.public_str);
        // System.out.println(house1.protected_str);  ERROR
        // System.out.println(house1.private_str);    ERROR
        // System.out.println(house1.default_str);    ERROR
        System.out.println("-------------------");

        Home home1 = new Home();
        home1.printInfo();
    }
}
