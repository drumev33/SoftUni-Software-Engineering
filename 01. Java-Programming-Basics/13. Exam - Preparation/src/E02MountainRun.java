import java.util.Scanner;

public class E02MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double secPerMeter = Double.parseDouble(scanner.nextLine());

        double totalSec = 0;
        double mps = 0;

        double slowedSec = Math.floor((distanceMeters / 50)) * 30;
        totalSec = (distanceMeters * secPerMeter) + slowedSec;

        if (totalSec < record) {
            System.out.printf("Yes! The new record is %.2f seconds.", totalSec);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", Math.abs(record - totalSec));
        }
    }
}
