import java.util.Arrays;
import java.util.Scanner;

public class E02ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(element -> Integer.parseInt(element)).toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tool = input.split("\\s+");

            switch (tool[0]) {
                case "swap":
                    int indexOne = Integer.parseInt(tool[1]);
                    int indexTwo = Integer.parseInt(tool[2]);
                    int savedIndex = numbers[indexOne];
                    // 5 3 1 3 5 3
                    // 0 1 2 3 4 5
                    numbers[indexOne] = numbers[indexTwo];
                    numbers[indexTwo] = savedIndex;
                    break;
                case "multiply":
                    indexOne = Integer.parseInt(tool[1]);
                    indexTwo = Integer.parseInt(tool[2]);
                    numbers[indexOne] *= numbers[indexTwo];
                    break;
                case "decrease":
                    dec(numbers);
                    break;
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
    }
    static void dec (int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]--;
        }
    }
}
