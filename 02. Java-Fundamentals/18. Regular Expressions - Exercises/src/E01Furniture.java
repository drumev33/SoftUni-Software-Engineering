import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = ">>(?<name>[A-Za-z]+)<<(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(expression);

        double total = 0;

        String input = scanner.nextLine();

        System.out.println("Bought furniture:");

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                total += quantity * price;
                System.out.println(name);
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total money spend: %.2f", total);
    }
}
