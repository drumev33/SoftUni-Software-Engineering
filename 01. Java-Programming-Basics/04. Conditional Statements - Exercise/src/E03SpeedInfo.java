import java.util.Scanner;

public class E03SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double speed = Double.parseDouble(scanner.nextLine());

        if (speed <= 10.00) {
            System.out.println("slow");
        } else if (speed <= 50.00) {
            System.out.println("average");
        } else if (speed <= 150.0) {
            System.out.println("fast");
        } else if (speed <= 1000.0) {
            System.out.println("ultra fast");
        } else {
            System.out.println("extremely fast");
        }
    }
}
