import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class E06ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        List<String> str = new ArrayList<>();
        for (int i = 0; i < lines; i++) {
            String input = scanner.nextLine();
            str.add(input);
        }

        Collections.sort(str);
        for (int i = 0; i < str.size(); i++) {
            System.out.println(i + 1 + "." + str.get(i));
        }
    }
}
