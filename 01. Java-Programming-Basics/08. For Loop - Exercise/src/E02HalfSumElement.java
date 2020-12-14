import java.util.Scanner;

public class E02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxNum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;

            if (number > maxNum) {
                maxNum = number;
            }
        }

        int sumWithoutMax = sum - maxNum;

        if (maxNum == sumWithoutMax) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxNum);
        } else {
            int diff = Math.abs(maxNum - sumWithoutMax);

            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }
    }
}
