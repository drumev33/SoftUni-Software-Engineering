import java.util.Arrays;
import java.util.Scanner;

public class E05Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(s -> Integer.parseInt(s))
                .sorted((a, b) -> Integer.compare(b, a))
                .limit(3)
                .forEach(i -> System.out.print(i + " "));
    }
}

//My Code for this exercise
/*
List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt).sorted((n1, n2) -> n2.compareTo(n1))
                .collect(Collectors.toList());

        if (numbers.size() <= 3) {
            for (int i = 0; i < numbers.size(); i++) {
                System.out.print(numbers.get(i) + " ");
            }
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.print(numbers.get(i) + " ");
            }
        }
 */