import java.util.Scanner;

public class E10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.charAt(0) == '-') {
            input = input.replace("-", "");
        }
        int[] numbers = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            int digit = input.charAt(i) - 48;
            numbers[i] = digit;
        }
        System.out.println(getMultipleOfEvensAndOdds(numbers));
    }

    private static int getMultipleOfEvensAndOdds(int[] number) {
        int evenSum = getEvenSum(number);
        int oddSum = getOddSum(number);

        return evenSum * oddSum;
    }

    private static int getEvenSum(int[] numbers) {
        int evenSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i];
            }
        }
        return evenSum;
    }

    private static int getOddSum(int[] numbers) {
        int oddSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddSum += numbers[i];
            }
        }
        return oddSum;
    }
}
