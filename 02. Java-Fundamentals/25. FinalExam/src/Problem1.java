import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String command = scanner.nextLine();
        while (!command.equals("Sign up")) {
            String[] commandParts = command.split(" ");

            String newUsername = "";
            switch (commandParts[0]) {
                case "Case":
                    if (commandParts[1].equals("upper")) {
                        newUsername = username.toUpperCase();
                        username = newUsername;
                    } else if (commandParts[1].equals("lower")) {
                        newUsername = username.toLowerCase();
                        username = newUsername;
                    }
                    System.out.println(username);
                    break;
                case "Reverse":
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);

                    if (endIndex > username.length()) {
                        break;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        for (int i = startIndex; i <= endIndex; i++) {
                            char ch = username.charAt(i);
                            sb.append(ch);
                        }
                        sb.reverse();
                        System.out.println(sb);
                    }
                    break;
                case "Cut":
                    if (username.contains(commandParts[1])) {
                        username = username.replaceAll(commandParts[1], "");
                        System.out.println(username);
                    } else {
                        System.out.printf("The word %s doesn't contain %s.%n", username, commandParts[1]);
                    }
                    break;
                case "Replace":
                    if (username.contains(commandParts[1])) {
                        newUsername = username.replaceAll(commandParts[1], "*");
                        username = newUsername;
                        System.out.println(username);
                    }
                    break;
                case "Check":
                    if (username.contains(commandParts[1])) {
                        System.out.println("Valid");
                    } else {
                        System.out.printf("Your username must contain %s.%n", commandParts[1]);
                    }
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
