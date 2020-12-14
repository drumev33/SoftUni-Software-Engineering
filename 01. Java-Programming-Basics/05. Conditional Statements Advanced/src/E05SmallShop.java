import java.util.Scanner;

public class E05SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0.0;

        if (product.equals("coffee")) {
            if (city.equals("Sofia")) {
                price = quantity * 0.50;
            } else if (city.equals("Plovdiv")) {
                price = quantity * 0.40;
            } else if (city.equals("Varna")) {
                price = quantity * 0.45;
            }
            System.out.println(price);
        }
        if (product.equals("water")) {
            if (city.equals("Sofia")) {
                price = quantity * 0.80;
            } else if (city.equals("Plovdiv")) {
                price = quantity * 0.70;
            } else if (city.equals("Varna")) {
                price = quantity * 0.70;
            }
            System.out.println(price);
        }
        if (product.equals("beer")) {
            if (city.equals("Sofia")) {
                price = quantity * 1.20;
            } else if (city.equals("Plovdiv")) {
                price = quantity * 1.15;
            } else if (city.equals("Varna")) {
                price = quantity * 1.10;
            }
            System.out.println(price);
        }
        if (product.equals("sweets")) {
            if (city.equals("Sofia")) {
                price = quantity * 1.45;
            } else if (city.equals("Plovdiv")) {
                price = quantity * 1.30;
            } else if (city.equals("Varna")) {
                price = quantity * 1.35;
            }
            System.out.println(price);
        }
        if (product.equals("peanuts")) {
            if (city.equals("Sofia")) {
                price = quantity * 1.60;
            } else if (city.equals("Plovdiv")) {
                price = quantity * 1.50;
            } else if (city.equals("Varna")) {
                price = quantity * 1.55;
            }
            System.out.println(price);
        }
    }
}
