import java.util.Scanner;

public class E04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberGiven = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < numberGiven; i++) {
            char charGiven = scanner.nextLine().charAt(0);
            int digit = charGiven;
            sum += charGiven;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
