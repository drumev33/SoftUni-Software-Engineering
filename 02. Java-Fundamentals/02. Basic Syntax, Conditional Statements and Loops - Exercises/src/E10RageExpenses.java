import java.util.Scanner;

public class E10RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGame = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int lostGameCounter = 0;
        int lostGameKey = 0;

        double total = 0;

            for (int i = 1; i <= lostGame; i++) {
                lostGameCounter++;
                if (lostGameCounter % 2 == 0) {
                    total += headsetPrice;
                }
                if (lostGameCounter % 3 == 0) {
                    total += mousePrice;
                }
                if (lostGameCounter % 2 == 0 && lostGameCounter % 3 == 0) {
                    total += keyboardPrice;
                    lostGameKey++;
                }
                if (lostGameKey == 2) {
                    total += displayPrice;
                    lostGameKey = 0;
                }
            }

            System.out.printf("Rage expenses: %.2f lv.", total);

    }
}
