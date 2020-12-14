import java.util.Scanner;

public class E01SignOfInteger {
    public static void main(String[] args) {
        signOfInteger();
    }
    public static void signOfInteger() {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number == 0) {
            System.out.printf("The number %d is zero.", number);
        } else if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else {
            System.out.printf("The number %d is negative.", number);
        }
    }
}
