import java.util.Scanner;

public class E03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double price = 0.0;

        switch (flower) {
            case "Roses":
                price = 5.00 * amount;
                if (amount > 80) {
                    price *= 0.9;
                }
                break;
            case "Dahlias":
                price = 3.80 * amount;
                if (amount > 90) {
                    price *= 0.85;
                }
                break;
            case "Tulips":
                price = 2.80 * amount;
                if (amount > 80) {
                    price *= 0.85;
                }
                break;
            case "Narcissus":
                price = 3.00 * amount;
                if (amount < 120) {
                    price *= 1.15;
                }
                break;
            case "Gladiolus":
                price = 2.50 * amount;
                if (amount < 80) {
                    price *= 1.20;
                    break;
                }
        }

        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", amount, flower, Math.abs(price-budget));
        } else if (budget < price) {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(price-budget));

        }
    }
}
