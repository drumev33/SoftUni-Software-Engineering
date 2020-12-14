import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        boolean search = true;
        while (search) {
            search = false;
            for (int i = 0; i < numbers.size() - 1; i++) {
                double current = numbers.get(i);
                double next = numbers.get(i + 1);
                if (current == next) {
                    numbers.remove(i);
                    numbers.set(i, current + next);
                    search = true;
                    break;
                }
            }
        }

            String output = joinElementsByDelimiter(numbers, " ");
        System.out.println(output);
    }

    public static String joinElementsByDelimiter
            (List<Double> items, String delimiter) {
        String output = "";
        for (Double item : items) {
            output += (new DecimalFormat("0.#").format(item) + delimiter);
        }
        return output;
    }
}
