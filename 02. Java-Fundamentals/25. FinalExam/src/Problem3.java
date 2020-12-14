import java.util.*;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> userMessage = new TreeMap<>();
        Map<String, Integer> receivedMessagesMap = new HashMap<>();

        int messageCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Statistics")) {
            String[] commands = input.split("=");
            String user = commands[1];
            switch (commands[0]) {
                case "Add":
                    int sentMessage = Integer.parseInt(commands[2]);
                    int receivedMessage = Integer.parseInt(commands[3]);
                    userMessage.putIfAbsent(user, sentMessage + receivedMessage);
                    receivedMessagesMap.putIfAbsent(user, receivedMessage);
                    break;
                case "Message":
                    String sender = commands[1];
                    String receiver = commands[2];
                    if (userMessage.containsKey(sender)
                            && userMessage.containsKey(receiver)) {
                        userMessage.put(sender, userMessage.get(sender) + 1);
                        userMessage.put(receiver, userMessage.get(receiver) + 1);
                        receivedMessagesMap.put(receiver, receivedMessagesMap.get(receiver) + 1);
                        if (userMessage.get(sender) >= messageCapacity) {
                            userMessage.remove(sender);
                            receivedMessagesMap.remove(sender);
                            System.out.println(sender + " reached the capacity!");
                        }
                        if (userMessage.get(receiver) >= messageCapacity) {
                            userMessage.remove(receiver);
                            receivedMessagesMap.remove(receiver);
                            System.out.println(receiver + " reached the capacity!");
                        }
                    }
                    break;
                case "Empty":
                    if (userMessage.containsKey(user)) {
                        userMessage.remove(user);
                        receivedMessagesMap.remove(user);
                    } else if (user.equals("All")) {
                        userMessage.clear();
                        receivedMessagesMap.clear();
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Users count: %d%n", userMessage.size());


        List<String> receivedList = receivedMessagesMap.entrySet().stream()
                .sorted((a,b) -> b.getValue() - a.getValue())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        for (int i = 0; i < receivedList.size(); i++) {
            String useruser = receivedList.get(i);
            System.out.println(receivedList.get(i) + " - " + userMessage.get(useruser));
        }
    }
}