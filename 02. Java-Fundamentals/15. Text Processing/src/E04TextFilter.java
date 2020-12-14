import java.util.Scanner;

public class E04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < input.length; i++) {
            String open = "";
            for (int j = 0; j < input[i].length(); j++) {
                open += '*';
            }
            int index = text.indexOf(input[i]);
            while (index != -1) {

                text = text.replace(input[i], open);
                index = text.indexOf(input[i]);
            }
        }

        System.out.println(text);
    }
}
