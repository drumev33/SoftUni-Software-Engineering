import java.util.Scanner;

public class E06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();

        double result = 0;

        switch (symbol) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.printf("Cannot divide %d by zero", a);
                } else {
                    result = 1.0 * a / b;
                    System.out.printf("%d / %d = %.2f", a, b, result);
                }
                break;
            case "%":
                if (b == 0) {
                    System.out.printf("Cannot divide %d by zero", a);
                } else {
                    result = a % b;
                    System.out.printf("%d %% %d = %.0f", a, b, result);
                }
                break;
        }

        if (!symbol.equals("/") && !symbol.equals("%")) {
            String type = "";
            if (result % 2 == 0) {
                type = "even";
            } else {
                type = "odd";
            }

            System.out.printf("%d %s %d = %.0f - %s", a, symbol, b, result, type);

        }

    }
}
