import java.util.Scanner;

public class E02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        StringBuilder repeat = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length(); j++) {
                repeat.append(input[i]);
            }
        }

        System.out.println(repeat.toString());
    }
}
