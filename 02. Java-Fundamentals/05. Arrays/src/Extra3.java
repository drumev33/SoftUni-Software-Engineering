import java.util.Scanner;

public class Extra3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = new String[] {"The", "quick", "brown", "fox"};

        String s = String.join("--->", words);

        System.out.println(s);

    }
}
