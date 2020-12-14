import java.util.Scanner;

public class E13SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double days = Integer.parseInt(scanner.nextLine()) - 1;
        String typeRoom = scanner.nextLine();
        String feedback = scanner.nextLine();

        double roomOnePerson = 18.00;
        double apartment = 25.00;
        double presidentApartment = 35.00;

        double positive = 0.25;
        double negative = 0.10;

        double price = 0.0;

        if (typeRoom.equals("room for one person")) {
            if (days > 0 && days < 10) {
                price = roomOnePerson * days;
                if (feedback.equals("positive")) {
                    price = price + (price * positive);
                    System.out.printf("%.2f", price);
                } else if (feedback.equals("negative")) {
                    price = price - (price * negative);
                    System.out.printf("%.2f", price);
                }

            } else if (days >= 10 && days <= 15) {
                price = roomOnePerson * days;
                if (feedback.equals("positive")) {
                    price = price + (price * positive);
                    System.out.printf("%.2f", price);
                } else if (feedback.equals("negative")) {
                    price = price - (price * negative);
                    System.out.printf("%.2f", price);
                }

            } else if (days > 15) {
                price = roomOnePerson * days;
                if (feedback.equals("positive")) {
                    price = price + (price * positive);
                } else if (feedback.equals("negative")) {
                    price = price - (price * negative);
                    System.out.printf("%.2f", price);
                }

            }

        } else if (typeRoom.equals("apartment")) {
            if (days > 0 && days < 10) {
                price = (apartment * days);
                price = price - (price * 0.3);
                if (feedback.equals("positive")) {
                    price = price + (price * positive);
                    System.out.printf("%.2f", price);
                } else if (feedback.equals("negative")) {
                    price = price - (price * negative);
                    System.out.printf("%.2f", price);
                }

            } else if (days >= 10 && days <= 15) {
                price = (apartment * days);
                price = price - (price * 0.35);
                if (feedback.equals("positive")) {
                    price = price + (price * positive);
                    System.out.printf("%.2f", price);
                } else if (feedback.equals("negative")) {
                    price = price - (price * negative);
                    System.out.printf("%.2f", price);
                }

            } else if (days > 15) {
                price = (apartment * days);
                price = price - (price * 0.5);
                if (feedback.equals("positive")) {
                    price = price + (price * positive);
                    System.out.printf("%.2f", price);
                } else if (feedback.equals("negative")) {
                    price = price - (price * negative);
                    System.out.printf("%.2f", price);
                }
            }
        } else if (typeRoom.equals("president apartment")) {
            if (days > 0 && days < 10) {
                price = (presidentApartment * days);
                price = price - (price * 0.1);
                if (feedback.equals("positive")) {
                    price = price + (price * positive);
                    System.out.printf("%.2f", price);
                } else if (feedback.equals("negative")) {
                    price = price - (price * negative);
                    System.out.printf("%.2f", price);
                }

            } else if (days >= 10 && days <= 15) {
                price = (presidentApartment * days);
                price = price - (price * 0.15);
                if (feedback.equals("positive")) {
                    price = price + (price * positive);
                    System.out.printf("%.2f", price);
                } else if (feedback.equals("negative")) {
                    price = price - (price * negative);
                    System.out.printf("%.2f", price);
                }

            } else if (days > 15) {
                price = (presidentApartment * days);
                price = price - (price * 0.2);
                if (feedback.equals("positive")) {
                    price = price + (price * positive);
                    System.out.printf("%.2f", price);
                } else if (feedback.equals("negative")) {
                    price = price - (price * negative);
                    System.out.printf("%.2f", price);
                }
            }
        }
    }
}
