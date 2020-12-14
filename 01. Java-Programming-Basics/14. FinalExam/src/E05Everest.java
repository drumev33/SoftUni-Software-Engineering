import java.util.Scanner;

public class E05Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        int counterDays = 1;
        int totalMeter = 5364;

        while (!type.equals("END")) {
            if (type.equals("Yes")) {
                counterDays++;
            }

            int climberMeters = Integer.parseInt(scanner.nextLine());
            totalMeter += climberMeters;

            if (totalMeter >= 8848) {
                System.out.printf("Goal reached for %d days!", counterDays);
                return;
            }

            if (counterDays == 5) {
                System.out.printf("Failed!%n");
                System.out.printf("%d", totalMeter);
                return;
            } else {
                type = scanner.nextLine();
            }
        }
        System.out.printf("Failed!%n");
        System.out.printf("%d", totalMeter);
    }
}
