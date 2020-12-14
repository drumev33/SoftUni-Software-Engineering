import java.util.Scanner;

public class Extra2 {
    public static void main(String[] args) {
        String[] words = new Scanner(System.in).nextLine().split(" ");

        for (int i = 0; i < words.length; i++) {
            String repeatWord = repeat(words[i], words[i].length());
            System.out.print(repeatWord);
        }
    }

    private static String repeat(String word, int count) {
        String[] repeatArr = new String[count];
        for (int i = 0; i < count; i++) {
            repeatArr[i] = word;
        }

        return String.join("", repeatArr);
    }
}
