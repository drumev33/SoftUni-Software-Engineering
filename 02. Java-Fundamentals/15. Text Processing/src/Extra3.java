import java.util.Scanner;

public class Extra3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "Hello and goodbye";
        String s = text.substring(6, 9);
        String s2 = text.substring(6, text.length());
        System.out.println(s);
        System.out.println(s2);
        System.out.println(text);
    }

    private static String repeat(String word, int count) {
        String[] repeatArr = new String[count];
        for (int i = 0; i < count; i++) {
            repeatArr[i] = word;
        }

        return String.join("", repeatArr);
    }
}
