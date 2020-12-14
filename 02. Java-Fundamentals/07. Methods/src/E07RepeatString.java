import java.util.Scanner;

public class E07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int repetitionsCount = Integer.parseInt(scanner.nextLine());

        String repeated = repeat(str, repetitionsCount);

        System.out.println(repeated);
    }

    static String repeat(String s, int count) {
        String[] repetitions = new String[count];

        for (int i = 0; i < count; i++) {
            repetitions[i] = s;
        }

        return String.join("", repetitions);
    }

}
