import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Character> letterList = new ArrayList<>();

        String line = scanner.nextLine();
        while (!line.equals("end")) {
         letterList.add(line.charAt(0));

         line = scanner.nextLine();
        }

        char[] lettersArray = getCharArray(letterList);

        String output = new String(lettersArray);
        System.out.println(output.toUpperCase());
    }


    public static char[] getCharArray(List<Character> charList) {
        char[] lettersArray = new char[charList.size()];
        for (int i = 0; i < lettersArray.length; i++) {
            lettersArray[i] = charList.get(i);
        }
        return lettersArray;
    }
}
