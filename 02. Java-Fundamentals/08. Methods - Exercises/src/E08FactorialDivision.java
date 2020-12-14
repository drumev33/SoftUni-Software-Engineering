import java.util.Scanner;

public class E08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f", getFactorials(num1, num2));

    } // 1 x 2 x 3 x 4 x 5
    static double getFactorials(int num1, int num2) {
        double sum1 = 1.0;
        for (int i = 1; i <= num1; i++) {
            sum1 *= i;
        }

        double sum2 = 1.0;
        for (int i = 1; i <= num2; i++) {
            sum2 *= i;
        }

        return sum1 / sum2;
    }
}
