import java.util.Scanner;

public class E05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        while (!destination.equals("End")) {

            double budget = Double.parseDouble(scanner.nextLine());
            double savedMoney = 0;

            while (!(savedMoney >= budget)) {

                double amount = Double.parseDouble(scanner.nextLine());
                savedMoney += amount;

            }

            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();

        }
    }
}