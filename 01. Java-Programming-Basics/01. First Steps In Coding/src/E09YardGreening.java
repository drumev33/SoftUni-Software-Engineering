import java.util.Scanner;

public class E09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double m = Double.parseDouble(scanner.nextLine());

        double discount = ((m * 7.61) / 100) * 18;
        double total = m * 7.61 - discount;

        System.out.printf("The final price is: %.2f lv.", total);
        System.out.printf("The discount is: %.2f lv.", discount);

    }
}
