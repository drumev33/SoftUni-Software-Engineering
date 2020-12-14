import java.math.BigDecimal;
import java.util.Scanner;

public class E03ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNum = Integer.parseInt(scanner.nextLine());

        BigDecimal number = new BigDecimal(scanner.nextLine());

        for (int i = 1; i < totalNum; i++) {
            number = number.add(new BigDecimal(scanner.nextLine()));
        }
        System.out.println(number);
    }
}
