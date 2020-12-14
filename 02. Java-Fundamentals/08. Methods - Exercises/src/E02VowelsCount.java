import java.util.Scanner;

public class E02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String word =input.toLowerCase();

        System.out.println(getVowels(word));
    }

    private static int getVowels(String word) {
        int vowelsCount = 0;
        for (int i = 0; i < word.length(); i++) {
            String letter = String.valueOf(word.charAt(i));
            if (letter.equals("a") || letter.equals("e") || letter.equals("i") ||
                    letter.equals("o") || letter.equals("u")) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
