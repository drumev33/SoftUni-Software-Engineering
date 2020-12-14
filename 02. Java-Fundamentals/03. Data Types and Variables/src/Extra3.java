import java.util.Scanner;

public class Extra3 {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();

        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (Character.isDigit(current)) {
                sum += current - 48;
            }
        }
        System.out.println(sum);
    }
}
