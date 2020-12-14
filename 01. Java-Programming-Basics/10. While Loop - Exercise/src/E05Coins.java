import java.util.Scanner;

public class E05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());

        money = Math.floor(money * 100);

        int coinsCount = 0;

        while (money > 0) {
            if (money >= 200) {
                money -= 200;
                coinsCount++;
            } else if (money >= 100) {
                money -= 100;
                coinsCount++;
            } else if (money >= 50) {
                money -= 50;
                coinsCount++;
            } else if (money >= 20) {
                money -= 20;
                coinsCount++;
            } else if (money >= 10) {
                money -= 10;
                coinsCount++;
            } else if (money >= 5) {
                money -= 5;
                coinsCount++;
            } else if (money >= 2) {
                money -= 2;
                coinsCount++;
            } else if (money >= 1) {
                money -= 1;
                coinsCount++;
            }
        }

        System.out.println(coinsCount);

    }
}
