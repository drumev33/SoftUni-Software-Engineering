import java.util.*;
import java.util.stream.Collectors;

public class E03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        double average = 0;

        for (int i = 0; i < numbers.size(); i++) {
            average += numbers.get(i);
        }
        average /= numbers.size();


        List<Integer> aboveAverage = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > average) {
                aboveAverage.add(numbers.get(i));
            }
        }

        if (aboveAverage.isEmpty()) {
            System.out.println("No");
        } else {
            Collections.sort(aboveAverage);
            Collections.reverse(aboveAverage);
        }

        for (int i = 0; i < Math.min(aboveAverage.size(), 5); i++) {
            System.out.print(aboveAverage.get(i) + " ");

        }
    }
}
