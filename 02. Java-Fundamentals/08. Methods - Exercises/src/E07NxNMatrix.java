import java.util.Scanner;

public class E07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        matrix(number);
    }
    static void matrix(int number) {
        for (int row = 1; row <= number; row++) {
            for (int coloumn = 1; coloumn <= number; coloumn++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
