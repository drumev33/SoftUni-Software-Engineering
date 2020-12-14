import java.util.Scanner;

public class E03Aquapark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int spendHours = Integer.parseInt(scanner.nextLine());
        int peopleInGrp = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        double mmDay = 10.50;
        double mmNight = 8.40;
        double jaDay = 12.60;
        double jaNight = 10.20;

        double total = 0;

        switch (month) {
            case "march":
            case "april":
            case "may":
                if (timeOfDay.equals("day")) {
                    total = spendHours * mmDay * peopleInGrp;
                } else {
                    total = spendHours * mmNight * peopleInGrp;
                }
                break;
            case "june":
            case "july":
            case "august":
                if (timeOfDay.equals("day")) {
                    total = spendHours * jaDay * peopleInGrp;
                } else {
                    total = spendHours * jaNight * peopleInGrp;
                }
                break;
        }
        if (peopleInGrp >= 4) {
            total *= 0.9;
        }
        if (spendHours >= 5) {
            total *= 0.5;
        }
        System.out.printf("Price per person for one hour: %.2f%n", Math.abs(total / peopleInGrp / spendHours));
        System.out.printf("Total cost of the visit: %.2f", total);
    }
}
