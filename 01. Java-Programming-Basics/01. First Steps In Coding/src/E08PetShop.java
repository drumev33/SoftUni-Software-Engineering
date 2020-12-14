import java.util.Scanner;

public class E08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = Integer.parseInt(scanner.nextLine());
        int animals = Integer.parseInt(scanner.nextLine());

        double n1 = (amount * 2.50) + (animals * 4.00);

        System.out.printf("%.1f lv.", n1);

    }
}
