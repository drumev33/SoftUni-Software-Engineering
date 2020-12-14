import java.util.Scanner;

public class E09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        boolean isReversedSame = false;

        while (!input.equals("END")) {
            System.out.println(reversedSame(isReversedSame, input));
            input = scanner.nextLine();
        }

    }
    private static boolean reversedSame (boolean isReversedSame, String input) {
        int number = Integer.parseInt(input);
        int savedNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        }

        if (savedNumber == reversedNumber) {
            isReversedSame = true;
        } else {
            isReversedSame = false;
        }
        return isReversedSame;
    }
}
