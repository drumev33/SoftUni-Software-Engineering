import java.util.Scanner;

public class E02MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------");
        System.out.println("Enter the dungeons of MU ONLINE");
        System.out.println("--------");
        String[] input = scanner.nextLine().split("\\|");

        int health = 100;
        int coins = 0;

        for (int i = 0; i < input.length; i++) {
            String[] monster = input[i].split(" ");
            String name = monster[0];
            int healthMonster = Integer.parseInt(monster[1]);
            switch (name) {
                case "chest":
                    int foundCoins = Integer.parseInt(monster[1]);
                    coins += foundCoins;
                    System.out.printf("Seleron found %d bitcoins.%n", foundCoins);
                    break;
                case "potion":
                    int foundPotion = Integer.parseInt(monster[1]);
                    int sumHealth = foundPotion + health;
                    if (sumHealth > 100) {
                        sumHealth = sumHealth - 100;
                        foundPotion = foundPotion - sumHealth;
                        health = 100;
                    } else {
                        health += foundPotion;
                    }
                    System.out.printf("Seleron healed for %d hp.%n", foundPotion);
                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                default:
                    if (health - healthMonster >= 1) {
                        health -= healthMonster;
                        System.out.printf("Seleron slayed %s.%n", name);
                    } else {
                        System.out.printf("Seleron died! Killed by %s.%n", name);
                        System.out.printf("Best room: %d", i + 1);
                        return;
                    }
                    break;
            }
        }

        System.out.printf("Seleron made it!%nBitcoins: %d%nHealth: %d", coins, health);
    }
}
