import java.util.Scanner;

public class E03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        getBetweenChar(first, second);
    }

    private static void getBetweenChar(char first, char second) {
        int charIndex = (int) first;
        int charIndex2 = (int) second;

        if (charIndex < charIndex2) {
            for (int i = first + 1; i < second; i++) {
                char betweenChar = (char) i;
                System.out.print(betweenChar + " ");
            }
        } else {
            for (int i = second + 1; i < first; i++) {
                char betweenChar = (char) i;
                System.out.print(betweenChar + " ");
            }
        }
    }
}
