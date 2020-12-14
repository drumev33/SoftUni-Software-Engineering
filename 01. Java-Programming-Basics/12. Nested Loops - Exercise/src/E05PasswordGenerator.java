import java.util.Scanner;

public class E05PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        // symbol 1
        for (int i = 1; i < n; i++) {
            // symbol 2
            for (int j = 1; j < n; j++) {
                // symbol 3
                for (char k = 'a'; k < 'a' + m; k++) {
                    // symbol 4
                    for (char l = 'a'; l < 'a' + m; l++) {
                        // symbol 5
                        for (int o = 2; o <= n; o++) {
                            if (o > i && o > j) {
                                System.out.printf("%d%d%c%c%d ", i, j, k, l, o);
                            }
                        }
                    }
                }
            }
        }
    }
}
