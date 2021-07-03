public class App {
    public static void main(String[] args) {

        int num = 5;
        int factorial = factorial(num);
        System.out.println("Factorial of " + num + " is " + factorial);

    }

    private static int factorial(int num) {

        if (num <= 1) {
            return 1;
        }
        return factorial(num - 1) * num;

    }
}

/* Java uses pass by value, so num is changing only inside the factorial method. */