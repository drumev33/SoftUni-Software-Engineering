import java.util.Scanner;

public class E07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double moneyInMachine = 0;

        double nutsPrice = 2.0;
        double waterPrice = 0.7;
        double crispsPrice = 1.5;
        double sodaPrice = 0.8;
        double cokePrice = 1.0;

        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);

            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1.0 || coins == 2.0) {
                moneyInMachine += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    if (moneyInMachine < nutsPrice) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        moneyInMachine -= 2.0;
                        System.out.printf("Purchased %s%n", input);
                    }
                    break;
                case "Water":
                    if (moneyInMachine < waterPrice) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        moneyInMachine -= 0.7;
                        System.out.printf("Purchased %s%n", input);
                    }
                    break;
                case "Crisps":
                    if (moneyInMachine < crispsPrice) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        moneyInMachine -= 1.5;
                        System.out.printf("Purchased %s%n", input);
                    }
                    break;
                case "Soda":
                    if (moneyInMachine < sodaPrice) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        moneyInMachine -= 0.8;
                        System.out.printf("Purchased %s%n", input);
                    }
                    break;
                case "Coke":
                    if (moneyInMachine < cokePrice) {
                        System.out.println("Sorry, not enough money");
                    } else {
                        moneyInMachine -= 1.0;
                        System.out.printf("Purchased %s%n", input);
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", moneyInMachine);
    }
}
