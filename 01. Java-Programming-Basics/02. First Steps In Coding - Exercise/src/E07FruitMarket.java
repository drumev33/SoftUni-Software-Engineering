import java.util.Scanner;

public class E07FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberriesCA = Double.parseDouble(scanner.nextLine());
        double bananas = Double.parseDouble(scanner.nextLine());
        double oranges = Double.parseDouble(scanner.nextLine());
        double raspberry = Double.parseDouble(scanner.nextLine());
        double strawberries = Double.parseDouble(scanner.nextLine());

        double RaspberryPrice = strawberriesCA * 0.50;
        double BananasPrice = RaspberryPrice * 0.20;
        double OrangesPrice = RaspberryPrice * 0.60;

        double resultRaspberry = raspberry * RaspberryPrice;
        double resultBananas = bananas * BananasPrice;
        double resultOranges = oranges * OrangesPrice;
        double resultStrawberries = strawberriesCA * strawberries;

        double result = resultRaspberry + resultBananas + resultOranges + resultStrawberries;

        System.out.printf("%.2f", result);
    }
}
