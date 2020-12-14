import java.util.Scanner;

public class E01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        for (int i = 0; i < input.length; i++) {
            boolean isFalse = false;
            String currentUser = input[i];
            if (currentUser.length() >= 3 && currentUser.length() <= 16) {
                for (int j = 0; j < currentUser.length(); j++) {
                    char symbol = currentUser.charAt(j);
                    if (Character.isLetterOrDigit(symbol) || symbol == '-' || symbol == '_') {
                        isFalse = true;
                    } else {
                        isFalse = false;
                        break;
                    }
                }
            }
            if (isFalse) {
                System.out.println(currentUser);;
            }
        }
    }
}
