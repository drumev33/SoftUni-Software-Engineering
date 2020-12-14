import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "U\\$(?<username>[A-Z][a-z]+)U\\$P@\\$(?<password>(.*[A-Za-z]){5}[0-9]+)P@\\S";
        Pattern pattern = Pattern.compile(regex);

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String username = matcher.group("username");
                String password = matcher.group("password");
                if (username.length() < 3) {
                    System.out.println("Invalid username or password");
                } else {
                    System.out.println("Registration was successful");
                    System.out.printf("Username: %s, Password: %s%n", username, password);
                    counter++;
                }
            } else {
                System.out.println("Invalid username or password");
            }
        }
        System.out.println("Successful registrations: " + counter);
    }
}
