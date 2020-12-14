import java.util.Scanner;

public class E04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermenCount = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (season) {
            case "Spring":
                price = 3000;
                break;
            case "Summer":
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;
        }

        if (fishermenCount <= 6) {
         price *= 0.9;
        } else if (fishermenCount <= 11) {
            price *= 0.85;
        } else {
            price *= 0.75;
        }

        if (fishermenCount % 2 == 0 && !season.equals("Autumn")) {
         price *= 0.95;

        }

        if (price <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", Math.abs(price - budget));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(price - budget));
        }
    }
}