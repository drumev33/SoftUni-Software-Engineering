import java.util.Scanner;

public class E08FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lengthCM = Double.parseDouble(scanner.nextLine());
        double widthCM = Double.parseDouble(scanner.nextLine());
        double heightCM = Double.parseDouble(scanner.nextLine());
        double percentFull = Double.parseDouble(scanner.nextLine());

        double result = lengthCM * widthCM * heightCM;
        double resultLiters = result * 0.001;
        double liters = (resultLiters / 100) * (100 - percentFull);

        System.out.printf("%.2f", liters);
    }
}
