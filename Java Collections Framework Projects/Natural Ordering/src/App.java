import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList(
                "Apple", "Orange", "Mango", "Banana"
        ));

        List<Integer> numbers = new ArrayList<>(Arrays.asList(
           8, 4, 89, 12, -98, 0, -182, 67
        ));

        // Let's try to sort it... Success!
        Collections.sort(list);
        Collections.sort(numbers);
        System.out.println(list);
        System.out.println(numbers);
    }
}

// See Explanation.txt