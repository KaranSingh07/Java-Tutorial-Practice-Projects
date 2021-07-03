package building;

public class House {
    public String public_str = "This is house: Public";             // Bad practice
    protected String protected_str = "This is house: Protected";
    private String private_str = "This is house: Private";
    String default_str = "This is house: Default";  // default keyword is optional

    // To declare constants...
    public static final int size = 420;                     // Acceptable practice

    public void printInfo() {
        System.out.println("-----Accessing in the class itself-----");
        System.out.println(public_str);
        System.out.println(protected_str);
        System.out.println(private_str);
        System.out.println(default_str);
        System.out.println("-------------------");
    }
}
