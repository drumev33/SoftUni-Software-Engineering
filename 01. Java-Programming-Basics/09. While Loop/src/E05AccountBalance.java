import java.util.Scanner;

public class E05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalSum = 0;
        String input = scanner.nextLine();

        while (!input.equals("NoMoreMoney")) {
            double moneyInc = Double.parseDouble(input);
            if(moneyInc < 0) {
                System.out.println("Invalid operation!");
                break;
         }
            totalSum += moneyInc;
            System.out.printf("Increase: %.2f%n", moneyInc);
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", totalSum);
    }
}
