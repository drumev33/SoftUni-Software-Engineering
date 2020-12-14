import java.util.Scanner;

public class E06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(getMiddleChar(str));
    }

    private static String getMiddleChar(String str) {
        String[] symbol = new String[str.length()];
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            char charSymbol = str.charAt(i);
            symbol[i] = String.valueOf(charSymbol);
        }
        //4 / 2 = 2
        if (str.length() % 2 == 0) {
            int sum = str.length() / 2;
            str2 = symbol[sum - 1] + symbol[sum];
        } else {
            int sum = Math.round(str.length() / 2);
            str2 = symbol[sum];
        }
        return str2;
    }
}
