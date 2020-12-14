import java.util.Scanner;

public class E07ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double puzzle = 2.60;
        double speakingDoll = 3.00;
        double teddyBear = 4.10;
        double minion = 8.20;
        double truck = 2.00;

        System.out.println("Price of the vacation: ");
        double priceVacation = Double.parseDouble(scanner.nextLine());
        System.out.println("Sold Puzzles: ");
        double puzzleAmount = Double.parseDouble(scanner.nextLine());
        System.out.println("Sold Speaking dolls: ");
        double speakingDollAmount = Double.parseDouble(scanner.nextLine());
        System.out.println("Sold Teddy Bears: ");
        double teddyBearAmount = Double.parseDouble(scanner.nextLine());
        System.out.println("Sold Minions: ");
        double minionAmount = Double.parseDouble(scanner.nextLine());
        System.out.println("Sold Trucks: ");
        double truckAmount = Double.parseDouble(scanner.nextLine());

        double boughtQuantity = puzzleAmount + speakingDollAmount + teddyBearAmount + minionAmount + truckAmount;
        double boughtAmountPuzzle = puzzle * puzzleAmount;
        double boughtAmountSpeakingDoll = speakingDoll * speakingDollAmount;
        double boughtAmountTeddyBear = teddyBear * teddyBearAmount;
        double boughtAmountMinion = minion * minionAmount;
        double boughtAmountTruck = truck * truckAmount;
        double boughtAmount = boughtAmountPuzzle + boughtAmountSpeakingDoll + boughtAmountTeddyBear + boughtAmountMinion + boughtAmountTruck;

        if (boughtQuantity >= 50) {
            double resultMore50 = boughtAmount * 0.75;
            double result10percent = resultMore50 * 0.90;
            if (result10percent >= priceVacation) {
                double moneyLeft = result10percent - priceVacation;
                System.out.printf("Yes! ");
                System.out.printf("%.2f", moneyLeft);
                System.out.println(" lv left.");
            } else if (result10percent < priceVacation) {
                double moneyNeed = priceVacation - result10percent;
                System.out.printf("Not enough money! ");
                System.out.printf("%.2f", moneyNeed);
                System.out.println(" lv needed.");
            }
        } else if (boughtQuantity <= 49) {
            double resultLess50 = boughtAmount * 0.90;
            if (resultLess50 >= priceVacation) {
                double moneyLeft = resultLess50 - priceVacation;
                System.out.printf("Yes! ");
                System.out.printf("%.2f", moneyLeft);
                System.out.println(" lv left.");
            } else if (resultLess50 < priceVacation) {
                double moneyNeed = priceVacation - resultLess50;
                System.out.printf("Not enough money! ");
                System.out.printf("%.2f", moneyNeed);
                System.out.println(" lv needed.");
            }
        }
    }
}
