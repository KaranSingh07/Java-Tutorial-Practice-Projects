public class App {
    public static void main(String args[]) {
        // We can cast between different type of numerical types

        short shortValue = 12;
        int intValue = 234167;
        long longValue = 88735618;
        float floatValue = 5634.78f;
        float floatValue_way2 = (float)5634.78;
        /* It is because any number with decimal in it is by default double, not float
           so it should be converted to float if the variable is float
           either by placing 'f' at end or by using (float) casting
        */

        intValue = (int)floatValue;
        System.out.println(intValue);       // Decimal part truncated

        System.out.println((short)32770);   // After MAX value, it behaves like cycle and go to negative half
    }
}
