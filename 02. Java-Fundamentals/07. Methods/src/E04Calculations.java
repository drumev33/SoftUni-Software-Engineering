import java.util.Scanner;

public class E04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operator = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        if (operator.equals("add")) {
            add(a, b);
        } else if (operator.equals("multiply")) {
            multiply(a, b);
        } else if (operator.equals("subtract")) {
            subtract(a, b);
        } else if (operator.equals("divide")) {
            divide(a, b);
        }

    }

    private static void divide(int firstNumber, int secondNumber) {
        System.out.println(firstNumber / secondNumber);
    }

    private static void subtract(int firstNumber, int secondNumber) {
        System.out.println(firstNumber - secondNumber);
    }

    private static void multiply(int firstNumber, int secondNumber) {
        System.out.println(firstNumber * secondNumber);
    }

    private static void add (int firstNumber, int secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }
}
