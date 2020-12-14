import java.util.Scanner;

public class E08LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char char1 = scanner.nextLine().charAt(0);

        boolean lower = false;
        boolean upper = false;

        for (char i = 65; i <= 90; i++) {
            if (char1 == i) {
                upper = true;
            } else {
                lower = true;
            }
        }
        if (upper) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
