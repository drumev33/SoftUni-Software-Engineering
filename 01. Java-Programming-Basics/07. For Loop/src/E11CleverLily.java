import java.util.Scanner;

public class E11CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int liliAge = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double savedMoney = 0;

        for (int i = 1; i <= liliAge; i++) {
            if (i % 2 == 0) {
                savedMoney += i / 2 * 10;
                savedMoney -= 1;
            } else {
                savedMoney += toyPrice;
            }
        }

        if (savedMoney >= washingMachine) {
            System.out.printf("Yes! %.2f", Math.abs(savedMoney - washingMachine));
        } else {
            System.out.printf("No! %.2f", Math.abs(savedMoney - washingMachine));
        }
    }
}
