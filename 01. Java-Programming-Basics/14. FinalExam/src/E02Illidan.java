import java.util.Scanner;

public class E02Illidan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleAmount = Integer.parseInt(scanner.nextLine());
        int strength = Integer.parseInt(scanner.nextLine());
        int healthIllidan = Integer.parseInt(scanner.nextLine());

        int totalStr = peopleAmount * strength;

        if (totalStr >= healthIllidan) {
            System.out.printf("Illidan has been slain! You defeated him with %d points.", Math.abs(totalStr - healthIllidan));
        } else {
            System.out.printf("You are not prepared! You need %d more points.", Math.abs(healthIllidan - totalStr));
        }
    }
}
