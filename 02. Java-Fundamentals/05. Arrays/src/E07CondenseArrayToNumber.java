import java.util.Scanner;

public class E07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        if (numbers.length == 1) {
            System.out.println(numbers[0]);
            return;
        }

        int counter = numbers.length;
        while (counter > 1) {
            for (int i = 0; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i] + numbers[i + 1];
            }
            counter--;
        }
        System.out.println(numbers[0]);
    }
}
