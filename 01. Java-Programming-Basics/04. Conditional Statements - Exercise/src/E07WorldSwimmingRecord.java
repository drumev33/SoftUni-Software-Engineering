import java.util.Scanner;

public class E07WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSeconds = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double waterSlow = Math.floor(distanceMeters / 15.00) * 12.5;

        double secondsSwum = (distanceMeters * secondsPerMeter) + waterSlow;

        double result = 0.0;

        if (secondsSwum < recordSeconds) {
            result = secondsSwum;
            System.out.printf("Yes, he succeeded! The new world record is ");
            System.out.printf("%.2f", result);
            System.out.printf(" seconds.");
        } else if (secondsSwum >= recordSeconds) {
            result = secondsSwum - recordSeconds;
            System.out.printf("No, he failed! He was ");
            System.out.printf("%.2f", result);
            System.out.printf(" seconds slower.");
        }
    }
}
