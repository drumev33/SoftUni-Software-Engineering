import java.util.Scanner;

public class E06MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNum = Integer.MIN_VALUE;

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            int currentNumber = Integer.parseInt(input);
            if (currentNumber > maxNum) {
                maxNum = currentNumber;
            }
            input = scanner.nextLine();
        }
        System.out.println(maxNum);
    }
}
