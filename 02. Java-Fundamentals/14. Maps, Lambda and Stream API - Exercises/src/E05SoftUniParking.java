import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> userPlate = new LinkedHashMap<>();

        String command = "";
        String user = "";
        String plate = "";
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            if (input.length == 2) {
                command = input[0];
                user = input[1];
            } else {
                command = input[0];
                user = input[1];
                plate = input[2];
            }

            if (command.equals("register")) {
                if (userPlate.containsKey(user)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", plate);
                } else {
                    userPlate.put(user, plate);
                    System.out.printf("%s registered %s successfully%n", user, plate);
                }
            } else {
                if (userPlate.containsKey(user)) {
                    userPlate.remove(user);
                    System.out.printf("%s unregistered successfully%n", user);
                } else {
                    System.out.printf("ERROR: user %s not found%n", user);
                }
            }
        }

        userPlate.forEach((k, v) -> System.out.println(k + " => " + v));
    }
}
