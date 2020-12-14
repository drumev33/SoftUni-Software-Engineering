import java.util.Scanner;

public class E05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        StringBuilder passRev = new StringBuilder(username);
        passRev.reverse();

        String password = passRev.toString();
        String typePass = scanner.nextLine();

        int counter = 0;

        while (!typePass.equals(password)) {
            counter++;

            if (counter == 4) {
                System.out.printf("User %s blocked!", username);
                return;
            }

            System.out.println("Incorrect password. Try again.");

            typePass = scanner.nextLine();

        }

        System.out.printf("User %s logged in.", username);

    }
}
