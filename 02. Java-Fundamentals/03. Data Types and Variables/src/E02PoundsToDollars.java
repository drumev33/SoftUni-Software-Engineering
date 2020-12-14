import java.util.Scanner;

public class E02PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double BP = Double.parseDouble(scanner.nextLine());

        double dollar = BP * 1.31;

        System.out.printf("%.3f", dollar);
    }
}
