import java.util.Scanner;

public class E07ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char char1 = scanner.nextLine().charAt(0);
        char char2 = scanner.nextLine().charAt(0);
        char char3 = scanner.nextLine().charAt(0);

        System.out.printf("%s %s %s", char3, char2, char1);

    }
}
