import java.util.Scanner;

public class E10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        boolean flag = false;

        for (int i = 1; i <= num; i++) {
            sum = 0;

            String str = Integer.toString(i);

            for (int j = 0; j < str.length(); j++) {
                int digit = str.charAt(j) - 48;
                sum += digit;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}
