import java.util.Scanner;

public class E06CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char char1 = scanner.nextLine().charAt(0);
        char char2 = scanner.nextLine().charAt(0);
        char char3 = scanner.nextLine().charAt(0);

        System.out.printf("%s%s%s", char1, char2, char3);

    }
}
