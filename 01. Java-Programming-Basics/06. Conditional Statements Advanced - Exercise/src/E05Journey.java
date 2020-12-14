import java.util.Scanner;

public class E05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0.0;
        String destination = "";
        String where = "";

        if (budget <= 100) {
            switch (season) {
                case "summer":
                    budget *= 0.3;
                    destination = "Camp";
                    where = "Bulgaria";
                    break;
                case "winter":
                    budget *= 0.7;
                    destination = "Hotel";
                    where = "Bulgaria";
                    break;
            }
        } else if (budget <= 1000) {
            switch (season) {
                case "summer":
                    budget *= 0.4;
                    destination = "Camp";
                    where = "Balkans";
                    break;
                case "winter":
                    budget *= 0.8;
                    destination = "Hotel";
                    where = "Balkans";
                    break;
            }
        } else if (budget > 1000) {
            budget *= 0.9;
            destination = "Hotel";
            where = "Europe";
        }

        if (season.equals("summer")) {
            System.out.printf("Somewhere in %s", where);
            System.out.println();
            System.out.printf("%s - %.2f", destination, budget);
        } else if (season.equals("winter") || where.equals("Europe")) {
            System.out.printf("Somewhere in %s", where);
            System.out.println();
            System.out.printf("%s - %.2f", destination, budget);
        }
    }
}
