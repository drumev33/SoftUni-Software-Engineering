import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        //if I make group 2 of the letter only, I will not need substring.
        String regex = "([=/])[A-Z][A-Za-z]{2,}\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> list = new ArrayList<>();

        int points = 0;

        while (matcher.find()) {
            String foundMatch = matcher.group();
            String destination = foundMatch.substring(1, foundMatch.length() - 1);
            list.add(destination);
            points += destination.length();
        }

        System.out.print("Destinations: ");
        for (int i = 0; i < list.size(); i++) {
            if (list.size() - 1 == i) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println();
        System.out.println("Travel Points: " + points);

    }
}
