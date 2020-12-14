import java.util.Scanner;

public class E04CaesarChipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        char charIndex = 35;

        for (int i = 0; i < input.length(); i++) {
            int index = input.charAt(i) + 3;
            char ch = (char) index;
            System.out.print(ch);
        }
    }
}
