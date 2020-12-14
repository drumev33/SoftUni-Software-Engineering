import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Extra4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(13);
        numbers.add(68);
        numbers.add(111);
        numbers.add(256);
        Stream<Integer> stream = numbers.stream();
        IntStream stream3 = numbers.stream().mapToInt(i -> i);

        int[] numbersArray = new int[] {42, 13, 68, 11, 256};
        IntStream stream1 = Arrays.stream(numbersArray);
        stream1.sorted();
    }
}
