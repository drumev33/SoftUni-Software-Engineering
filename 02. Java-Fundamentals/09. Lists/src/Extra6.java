import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Extra6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = parseLineOfNumbers(scanner);

        int i = 0;
        while (i < numbers.size()) {
            if (numbers.get(i) < 0) {
                numbers.remove(i);
            } else {
                i++;
            }
        }

        // It will not work properly
//        for (int i = 0; i < numbers.size(); i++) {
//            if (numbers.get(i) < 0) {
//                numbers.remove(i);
//            }
//        }

        // It will take to much memory
//        List<Integer> nonNegativeNumbers = new ArrayList<>();
//        for (int number : numbers) {
//            if (number >= 0) {
//                nonNegativeNumbers.add(number);
//            }
//        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static List<Integer> parseLineOfNumbers(Scanner scanner) {
        String line = scanner.nextLine();

        String[] numbersAsStrings = line.split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (String s : numbersAsStrings) {
            int number = Integer.parseInt(s);
            numbers.add(number);
        }
        return numbers;
    }
}
