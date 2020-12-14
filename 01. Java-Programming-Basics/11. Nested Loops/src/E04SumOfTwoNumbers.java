import java.util.Scanner;

public class E04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        String output = "";

        int counter = 0;

        boolean magicNumberFound = false;

        for (int i = n1; i <= n2; i++) {
            for (int j = n1; j <= n2; j++) {
                counter++;
                if (i + j == magicNumber) {
                    output = String.format("Combination N:%d (%d + %d = %d)", counter, i, j, i+j);
                    magicNumberFound = true;
                    break;
                }
            }
            if (magicNumberFound) {
                break;
            }
        }
        if (magicNumberFound) {
            System.out.printf(output);
        } else {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
