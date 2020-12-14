import java.util.Scanner;

public class E03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount = Double.parseDouble(scanner.nextLine());
        double months = Double.parseDouble(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double result = amount + months * ((amount * (percent / 100)) / 12);

        System.out.println(result);
    }
}
