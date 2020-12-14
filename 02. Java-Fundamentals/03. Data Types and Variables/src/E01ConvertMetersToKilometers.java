import java.util.Scanner;

public class E01ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double m = Double.parseDouble(scanner.nextLine());

        double km = m / 1000;

        System.out.printf("%.2f", km);

    }
}
