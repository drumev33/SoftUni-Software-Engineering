import java.util.Scanner;

public class E03FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double cardPrice = 0;

        switch (sport) {
            case "Gym":
                if (sex.equals("m")) {
                    cardPrice += 42;
                } else {
                    cardPrice += 35;
                }
                break;
            case "Boxing":
                if (sex.equals("m")) {
                    cardPrice += 41;
                } else {
                    cardPrice += 37;
                }
                break;
            case "Yoga":
                if (sex.equals("m")) {
                    cardPrice += 45;
                } else {
                    cardPrice += 42;
                }
                break;
            case "Zumba":
                if (sex.equals("m")) {
                    cardPrice += 34;
                } else {
                    cardPrice += 31;
                }
                break;
            case "Dances":
                if (sex.equals("m")) {
                    cardPrice += 51;
                } else {
                    cardPrice += 53;
                }
                break;
            case "Pilates":
                if (sex.equals("m")) {
                    cardPrice += 39;
                } else {
                    cardPrice += 37;
                }
                break;
        }
        if (age <= 19) {
            cardPrice *= 0.8;
        }
        if (budget >= cardPrice) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", Math.abs(budget - cardPrice));
        }
    }
}
