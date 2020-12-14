import java.util.Scanner;

public class E04Rate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double s = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());

        double totalSimple = s;
        double totalComplex = s;

        String simpleInterest = "simple";
        String complexInterest = "complex";

        String betterOption = "";

        for (int i = 1; i <= months; i++) {
            totalSimple += s * 0.03;
            totalComplex += totalComplex * 0.027;
        }
        if (totalComplex > totalSimple) {
            betterOption = complexInterest;
        } else {
            betterOption = simpleInterest;
        }
        System.out.printf("Simple interest rate: %.2f lv.%n", totalSimple);
        System.out.printf("Complex interest rate: %.2f lv.%n", totalComplex);
        System.out.printf("Choose a %s interest rate. You will win %.2f lv.", betterOption, Math.abs(totalComplex - totalSimple));
    }
}
