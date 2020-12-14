import java.util.Scanner;

public class E11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int u = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        if (u > 10) {
            System.out.printf("%d X %d = %d%n", n, u, n * u);
            return;
        }

        while (u <= 10) {
            System.out.printf("%d X %d = %d%n", n, u, n * u);
            u++;
        }
    }
}
