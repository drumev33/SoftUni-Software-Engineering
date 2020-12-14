import java.text.DecimalFormat;
import java.util.Scanner;

public class E08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(mathPower(number, power)));
    }

    static double mathPower(double n1, int pow) {
        double result = 0;
        result = Math.pow(n1, pow);
        return result;
    }
}
