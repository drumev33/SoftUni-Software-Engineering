import java.util.Scanner;

public class E05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int x = Integer.parseInt(scanner.nextLine());

        switch (type) {
            case "coffee":
                sum(1.50, x);
                break;
            case "water":
                sum(1.00, x);
                break;
            case "coke":
                sum(1.40, x);
                break;
            case "snacks":
                sum(2.00, x);
                break;
        }

    }
    private static void sum (double price, int amount) {
        System.out.printf("%.2f", price * amount);
    }
}
