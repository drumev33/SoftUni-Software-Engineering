import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> list = new ArrayList<>();
        String pinnedMessage = "";
        boolean pinMessaged = false;
        while(!input.equals("end")) {
            String[] chat = input.split("\\s+");

            switch (chat[0]) {
                case "Chat":
                    list.add(chat[1]);
                    break;
                case "Delete":
                    list.remove(chat[1]);
                    break;
                case "Edit":
                    int index = list.indexOf(chat[1]);
                    list.set(index, chat[2]);
                    break;
                case "Pin":
                    list.remove(chat[1]);
                    list.add(chat[1]);
//                    pinnedMessage = chat[1];
//                    pinMessaged = true;
                    break;
                case "Spam":
                    for (int i = 1; i < chat.length; i++) {
                        list.add(chat[i]);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

//        if (pinMessaged) {
//            list.remove(pinnedMessage);
//            list.add(pinnedMessage);
//        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

//        •	Chat {message} - add the message at last position in the chat
//        •	Delete {messageToDelete} - delete the message if it exists
//        •	Edit {messageToEdit} {editedVersion} - update the message with the edited version
//        •	Pin {message} - find the given message and move it to the last index
//        •	Spam {message1} {message2} {messageN} - add all messages at the end of the chat
//        •	end - stop receiving commands
