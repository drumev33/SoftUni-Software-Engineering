import java.util.Scanner;

public class E09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int resultLeft = 0;
        int resultRight = 0;

        for (int i = 0; i < n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            resultLeft += numbers;
        }
        for (int i = 0; i < n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            resultRight += numbers;
        }
        if (resultLeft == resultRight) {
            System.out.printf("Yes, sum = %d", resultLeft);
        } else {
            System.out.printf("No, diff = %d", Math.abs(resultLeft - resultRight));
        }
    }
}
