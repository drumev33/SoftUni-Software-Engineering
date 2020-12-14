import java.util.Scanner;

public class E01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double premiere = 12.00;
        double normal = 7.50;
        double discount = 5.00;

        String type = scanner.nextLine();
        double r = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());

        double result = 0.0;

        switch (type) {
            case "Premiere":
            result = r * c * premiere;
                System.out.printf("%.2f", result);
            break;
            case "Normal":
                result = r * c * normal;
                System.out.printf("%.2f", result);
                break;
            case "Discount":
                result = r * c * discount;
                System.out.printf("%.2f", result);
                break;
        }
    }
}
