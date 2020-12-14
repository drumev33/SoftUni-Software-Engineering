import java.util.Scanner;

public class E06GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double actorsAmount = Double.parseDouble(scanner.nextLine());
        double clothsPPA = Double.parseDouble(scanner.nextLine());

        double setPrice = (budget / 100) * 10;

        double price = (actorsAmount * clothsPPA) + setPrice;
        double result = 0.0;
        double clothsDiscountPrice = ((clothsPPA * 0.90) * actorsAmount) + setPrice;

        if (budget >= price) {
            result = budget - price;
            if (actorsAmount > 150) {
                result = budget - clothsDiscountPrice;
            }
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with ");
            System.out.printf("%.2f", result);
            System.out.printf(" leva left.");
        } else if (budget < price) {
            result = price - budget;
            if (actorsAmount > 150) {
                result = clothsDiscountPrice - budget;
            }
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs ");
            System.out.printf("%.2f", result);
            System.out.printf(" leva more.");
        }
    }
}
