import java.util.Scanner;

public class E08TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int rows = 1; rows <= n ; rows++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print(rows + " ");
            }
            System.out.println();
        }
    }
}

