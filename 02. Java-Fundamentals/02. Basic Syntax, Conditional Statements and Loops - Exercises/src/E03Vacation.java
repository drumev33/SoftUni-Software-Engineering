import java.util.Scanner;

public class E03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleAmount = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        switch (type) {
            case "Students":
                switch (day) {
                    case "Friday":
                        price = peopleAmount * 8.45;
                        break;
                    case "Saturday":
                        price = peopleAmount * 9.80;
                        break;
                    case "Sunday":
                        price = peopleAmount * 10.46;
                        break;
            }

                if (peopleAmount >= 30) {
                    price *= 0.85;
                }

            break;
            case "Business":
                switch (day) {
                    case "Friday":
                        price = peopleAmount * 10.90;
                        break;
                    case "Saturday":
                        price = peopleAmount * 15.60;
                        break;
                    case "Sunday":
                        price = peopleAmount * 16.00;
                        break;
                }

                if (peopleAmount >= 100 && day.equals("Friday")) {
                    price -= (10 * 10.90);
                } else if (peopleAmount >= 100 && day.equals("Saturday")) {
                    price -= (10 * 15.60);
                } else if (peopleAmount >= 100 && day.equals("Sunday")) {
                    price -= (10 * 16.00);
                }

                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        price = peopleAmount * 15;
                        break;
                    case "Saturday":
                        price = peopleAmount * 20;
                        break;
                    case "Sunday":
                        price = peopleAmount * 22.50;
                        break;
                }

            if (peopleAmount >= 10 && peopleAmount <= 20) {
                price *= 0.95;

            }
        }
        System.out.printf("Total price: %.2f", price);
    }
}

