import java.util.ArrayList;
import java.util.List;

public class Extra3 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("George");
        names.add("Maria");
        names.add("Peter");

        names.remove(1);

        for (String name : names) {
            System.out.print(name + " ");
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(13);
        numbers.add(69);

        //numbers.remove(13(Will remove index 13));
        numbers.remove((Integer) 13);

        for (int n : numbers) {
            System.out.print(n + " ");
        }

    }
}
