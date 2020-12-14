import java.util.Scanner;

public class E05PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String guess = scanner.nextLine();
        String pass = "s3cr3t!P@ssw0rd";

        if (pass.equals(guess)) {
            System.out.println("Welcome");
        } else  {
            System.out.println("Wrong password!");
        }
    }
}
