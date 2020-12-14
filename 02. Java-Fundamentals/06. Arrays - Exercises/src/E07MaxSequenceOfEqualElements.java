import java.util.Arrays;
import java.util.Scanner;

public class E07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(element -> Integer.parseInt(element)).toArray();

        int index = 0;
        int counter = 0;

        // 2 1 1 2 3 3 2 2 2 1             2 2 2 3 4 1 5
        for (int i = 0; i < numbers.length; i++) {

            int currentCount = 0;

            for (int j = i; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {
                    currentCount++;

                    if (currentCount > counter) {
                        counter = currentCount;
                        index = i;
                    }

                } else {
                    break;
                }
            }
        }
        for (int i = 0; i < counter; i++) {
            System.out.print(numbers[i + index] + " ");
        }
    }
}
