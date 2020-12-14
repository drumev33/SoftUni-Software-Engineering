import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resource = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("stop")) {
            int res = Integer.parseInt(scanner.nextLine());
            if (resource.containsKey(input)) {
                int count = resource.get(input);
                resource.put(input, count + res);
            } else {
                resource.put(input, res);
            }


            input = scanner.nextLine();
        }

        resource.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
