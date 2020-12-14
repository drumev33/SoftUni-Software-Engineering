import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Extra5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
