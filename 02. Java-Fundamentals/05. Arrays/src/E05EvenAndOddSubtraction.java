import java.util.Scanner;

public class E05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");

        int sumOdd = 0;
        int sumEven = 0;

        int[] digits = new int[numbers.length];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = Integer.parseInt(numbers[i]);
            if (digits[i] % 2 == 0) {
                sumEven += digits[i];
            } else {
                sumOdd += digits[i];
            }
        }
        System.out.println(sumEven - sumOdd);
    }
}
