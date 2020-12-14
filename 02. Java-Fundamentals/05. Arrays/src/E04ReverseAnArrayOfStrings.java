import java.util.Scanner;

public class E04ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] string = scanner.nextLine().split(" ");

        for (int i = string.length - 1; i >= 0; i--) {
            System.out.print(string[i] + " ");
        }
    }
}
