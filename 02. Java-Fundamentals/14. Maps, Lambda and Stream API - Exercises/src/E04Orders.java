import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> mapProducts = new LinkedHashMap<>();
        Map<String, Integer> mapQuantity = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("buy")) {
            String[] products = input.split("\\s+");
            String product = products[0];
            double price = Double.parseDouble(products[1]);
            int quantity = Integer.parseInt(products[2]);

            mapProducts.putIfAbsent(product, price);

            if (mapQuantity.containsKey(product)) {
                int current = mapQuantity.get(product);
                mapQuantity.put(product, quantity + current);
            }

            mapQuantity.putIfAbsent(product, quantity);

            if (mapProducts.containsKey(product)) {
                mapProducts.replace(product, price * mapQuantity.get(product));
            }

            input = scanner.nextLine();
        }

        mapProducts.forEach((k, v) -> System.out.printf(String.format("%s -> %.2f%n", k, v)));
    }
}
