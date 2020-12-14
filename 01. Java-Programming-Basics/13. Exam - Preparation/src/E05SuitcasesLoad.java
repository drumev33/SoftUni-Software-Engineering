import java.util.Scanner;

public class E05SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());

        String volume = scanner.nextLine();

        double volumeTotal = 0;
        int suitcaseCounter = 0;

        while (!volume.equals("End")) {

            double vm = Double.parseDouble(volume);
            suitcaseCounter++;

            if (suitcaseCounter % 3 == 0) {
                vm += vm * 0.1;
            }

            volumeTotal += vm;
            capacity -= vm;

            if (capacity <= 0) {
                suitcaseCounter--;
                System.out.printf("No more space!%n");
                System.out.printf("Statistic: %d suitcases loaded.", suitcaseCounter);
                return;
            }

            volume = scanner.nextLine();
        }
        System.out.printf("Congratulations! All suitcases are loaded!%n");
        System.out.printf("Statistic: %d suitcases loaded.", suitcaseCounter);
    }
}
