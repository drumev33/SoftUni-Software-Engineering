import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class E02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numExp = "[0-9]";
        String nameExp = "[A-Za-z]";
        String[] participants = scanner.nextLine().split(", ");
        Pattern patternDigits = Pattern.compile(numExp);
        Pattern pattern = Pattern.compile(nameExp);

        Map<String, Integer> users = new LinkedHashMap<>();
        for (int i = 0; i < participants.length; i++) {
            users.putIfAbsent(participants[i], 0);
        }

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                StringBuilder sb = new StringBuilder();
                sb.append(matcher.group());
                while (matcher.find()) {
                    sb.append(matcher.group());
                }

                String name = sb.toString();
                if (users.containsKey(name)) {
                    Matcher matcherDigits = patternDigits.matcher(input);
                    if (matcherDigits.find()) {
                        int digits = Integer.parseInt(matcherDigits.group());
                        users.put(name, users.get(name) + digits);
                        while (matcherDigits.find()) {
                            digits = Integer.parseInt(matcherDigits.group());
                            users.put(name, users.get(name) + digits);
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }

        List<String> winners = users.entrySet().stream()
                .sorted((a,b) -> b.getValue() - a.getValue())
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

            System.out.println("1st place: " + winners.get(0));
            System.out.println("2nd place: " + winners.get(1));
            System.out.println("3rd place: " + winners.get(2));
    }
}
