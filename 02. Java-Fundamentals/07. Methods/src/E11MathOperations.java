import java.util.Scanner;

public class E11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int n2 = Integer.parseInt(scanner.nextLine());

        System.out.println(calculate(n1, operator, n2));

    }

    private static int calculate(int n1, char operator, int n2) {
        int result = 0;
        switch (operator) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                result = n1 / n2;
                break;
        }
        return result;
    }

}
