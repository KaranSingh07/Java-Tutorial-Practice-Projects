package building;

/* There are 4 types of access specifiers in Java
1.) Public: Accessible to everywhere (Keyword public)
2.) Default: Accessible inside the class, inside the same package (No need to specify anything).
3.) Protected: Accessible inside the class, subclasses of any package (Keyword protected).
4.) Private: Accessible inside the class only (Keyword private).

                        Public       Default            Protected             Private
                     (Everywhere)   (Package)    (Package OR Subclasses)   (Class itself)

Same class               Yes          Yes                 Yes                   Yes


Same package             Yes          Yes                 Yes                   No


Different package        Yes          No                  Yes                   No
subclass

Different package        Yes          No                   No                   No
non-subclass

 */

class Home extends House {
    public void printInfo() {
        System.out.println("-----Accessing in same package subclass-----");
        System.out.println(public_str);
        System.out.println(protected_str);
        // System.out.println(private_str);     ERROR
        System.out.println(default_str);
        System.out.println("-------------------");
    }
}

public class App {
    public static void main(String args[]) {
        House house1 = new House();
        house1.printInfo();

        System.out.println("-----Accessing in same package non-subclass-----");
        System.out.println(house1.public_str);
        System.out.println(house1.protected_str);
        // System.out.println(house1.private_str);  ERROR
        System.out.println(house1.default_str);
        System.out.println("-------------------");

        Home home1 = new Home();
        home1.printInfo();
    }
}
