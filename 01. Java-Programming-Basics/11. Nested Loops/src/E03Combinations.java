import java.util.Scanner;

public class E03Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int validCombinationsCount = 0;

        int n = Integer.parseInt(scanner.nextLine());

        for (int x1 = 0; x1<= n; x1++) {
            for (int x2 = 0; x2<= n; x2++) {
                for (int x3 = 0; x3<= n; x3++) {
                    if (x1 + x2 + x3 == n) {
                        validCombinationsCount++;
                    }
                }
            }
        }
        System.out.println(validCombinationsCount);
    }
}
