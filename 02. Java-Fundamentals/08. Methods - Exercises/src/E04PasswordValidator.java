import java.util.Scanner;

public class E04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        boolean lengthValid = lengthValid(password);
        boolean symbolValid = symbolValid(password);
        boolean numbersValid = numbersValid(password);

        if (lengthValid(password)
                && symbolValid(password)
                && numbersValid(password)) {
            System.out.println("Password is valid");
        }
        if (!lengthValid) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!symbolValid) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!numbersValid) {
            System.out.println("Password must have at least 2 digits");
        }

    }

    private static boolean lengthValid(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }
    private static boolean symbolValid(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            boolean isLetter = Character.isLetter(symbol);
            boolean isDigit = Character.isDigit(symbol);

            if (!isDigit && !isLetter) {
                return false;
            }
        }
        return true;
    }
    private static boolean numbersValid(String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (Character.isDigit(symbol)) {
                counter++;
            }
            if (counter >= 2) {
                return true;
            }
        }
        return false;
    }
}
