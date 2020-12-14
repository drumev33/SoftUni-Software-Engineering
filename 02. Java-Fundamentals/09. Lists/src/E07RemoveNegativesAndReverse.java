import java.util.*;
import java.util.stream.Collectors;

public class E07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> nonNegativeNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number >= 0) {
                nonNegativeNumbers.add(number);
            }
        }

        if (nonNegativeNumbers.size() == 0) {
            System.out.println("empty");
        } else {
            Collections.reverse(nonNegativeNumbers);
            for (Integer nonNegativeNumber : nonNegativeNumbers) {
                System.out.print(nonNegativeNumber + " ");
            }
        }
    }
}
