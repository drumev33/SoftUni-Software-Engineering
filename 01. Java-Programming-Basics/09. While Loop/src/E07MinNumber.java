import java.util.Scanner;

public class E07MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minNum = Integer.MAX_VALUE;

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            int currentNumber = Integer.parseInt(input);
            if (currentNumber < minNum) {
                minNum = currentNumber;
            }
            input = scanner.nextLine();
        }
        System.out.println(minNum);
    }
}
