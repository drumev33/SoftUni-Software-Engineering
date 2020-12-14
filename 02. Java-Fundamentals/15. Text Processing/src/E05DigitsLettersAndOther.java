import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Character> chars = new ArrayList<>();
        List<Character> letters = new ArrayList<>();
        List<Character> numbers = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                numbers.add(c);
            } else if (Character.isLetter(c)) {
                letters.add(c);
            } else {
                chars.add(c);
            }
        }

        print(numbers);
        print(letters);
        print(chars);

    }

    public static void print (List<Character> charac) {
        for (Character character : charac) {
            System.out.print(character);
        }
        System.out.println();
    }
}
