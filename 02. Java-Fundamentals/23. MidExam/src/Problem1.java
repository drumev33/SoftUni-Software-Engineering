import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceFlour = Double.parseDouble(scanner.nextLine());
        double priceEgg = Double.parseDouble(scanner.nextLine());
        double priceApron = Double.parseDouble(scanner.nextLine());

        double sum = (priceFlour * students) + (priceEgg * 10 * students)
                + (priceApron * Math.ceil(students * 1.20));

        for (int i = 1; i <= students; i++) {
            if (i % 5 == 0) {
                sum -= priceFlour;
            }
        }

        if (sum <= budget) {
            System.out.printf("Items purchased for %.2f$.", sum);
        } else {
            System.out.printf("%.2f$ more needed.", Math.abs(sum - budget));
        }
    }
}

//zdrasti
