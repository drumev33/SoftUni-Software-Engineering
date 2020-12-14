import java.util.Scanner;

public class E06CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double days = Double.parseDouble(scanner.nextLine());
        double cakeMakers = Double.parseDouble(scanner.nextLine());
        double cakes = Double.parseDouble(scanner.nextLine());
        double gofretts = Double.parseDouble(scanner.nextLine());
        double pancakes = Double.parseDouble(scanner.nextLine());

        double result = ((cakes * 45.00) + (gofretts * 5.80) + (pancakes * 3.20)) * cakeMakers * days;
        double amount = result - ((1.0 / 8.0) * result);

        System.out.printf("%.2f", amount);
    }
}
