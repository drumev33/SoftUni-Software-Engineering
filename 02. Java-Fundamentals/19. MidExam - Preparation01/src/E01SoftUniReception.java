import java.util.Scanner;

public class E01SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeе1EfficiencyPerHour = Integer.parseInt(scanner.nextLine());
        int employee2EfficiencyPerHour = Integer.parseInt(scanner.nextLine());
        int employee3EfficiencyPerHour = Integer.parseInt(scanner.nextLine());

        int studentsRemaining = Integer.parseInt(scanner.nextLine());

        int capacityPerHour = employeе1EfficiencyPerHour + employee2EfficiencyPerHour + employee3EfficiencyPerHour;

        int hours = 0;

        while (studentsRemaining > 0) {
            hours += 1;
            studentsRemaining -= capacityPerHour;

            if (hours % 4 == 0) {
                hours += 1;
            }

        }

        System.out.printf("Time needed: %dh.", hours);
    }
}
