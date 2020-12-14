import java.util.Scanner;

public class E12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        int fact = 0;

        for (int i = 1; i <= num; i++) {
            fact = i;

            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }

            if ((sum == 5) || (sum == 7) || (sum == 11)) {
                System.out.printf("%d -> True%n", fact);
            } else {
                System.out.printf("%d -> False%n", fact);
            }
            i = fact;
            sum = 0;
        }
    }
}
