import java.util.Scanner;

public class E01SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int penAmount = Integer.parseInt(scanner.nextLine());
        int markerPackage = Integer.parseInt(scanner.nextLine());
        double cleaningPrep = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double total = 0;
        double discountAmount = (100 - discount * 1.00) / 100;

        total = ((penAmount * 5.80) + (markerPackage * 7.20) + (cleaningPrep * 1.20)) * discountAmount;

        System.out.printf("%.3f", total);

    }
}
