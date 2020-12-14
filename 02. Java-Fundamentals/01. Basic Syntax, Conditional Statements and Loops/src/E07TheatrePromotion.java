import java.util.Scanner;

public class E07TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();

        int age = Integer.parseInt(scanner.nextLine());

        int ticket = 0;

        switch (dayType) {
            case "Weekday":
                if (age >= 0 && age <= 18) {
                    ticket += 12;
                } else if (age > 18 && age <= 64) {
                    ticket += 18;
                } else if (age > 64 && age <= 122) {
                    ticket += 12;
                } else {
                    System.out.println("Error!");
                    return;
                }
                break;
            case "Weekend":
                if (age >= 0 && age <= 18) {
                    ticket += 15;
                } else if (age > 18 && age <= 64) {
                    ticket += 20;
                } else if (age > 64 && age <= 122) {
                    ticket += 15;
                } else {
                    System.out.println("Error!");
                    return;
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18) {
                    ticket += 5;
                } else if (age > 18 && age <= 64) {
                    ticket += 12;
                } else if (age > 64 && age <= 122) {
                    ticket += 10;
                } else {
                    System.out.println("Error!");
                    return;
                }
                break;
        }
        System.out.printf("%d$", ticket);
    }
}
