import java.util.Scanner;

public class E03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());

        int counterSpendDays = 0;
        int counterDays = 0;

        while (!(currentMoney >= moneyNeeded)) {
            String type = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());
            counterSpendDays = 0;
            while (type.equals("spend")) {
                counterSpendDays++;
                counterDays++;
                currentMoney -= amount;
                if (currentMoney < 0) {
                    currentMoney = 0;
                }
                if (counterSpendDays >= 5) {
                    System.out.println("You can't save the money.");
                    System.out.printf("%d", counterDays);
                    return;
                }
                type = scanner.nextLine();
                amount = Double.parseDouble(scanner.nextLine());
            }

            if (type.equals("save")) {
                currentMoney += amount;
            }
            counterDays++;
        }

        System.out.printf("You saved the money for %d days.", counterDays);

    }
}
