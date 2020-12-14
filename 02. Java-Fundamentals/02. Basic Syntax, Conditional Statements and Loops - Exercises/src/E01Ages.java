import java.util.Scanner;

public class E01Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String age = "";

        if (n <= 2) {
            age = "baby";
        } else if (n <= 13) {
            age = "child";
        } else if (n <= 19) {
            age = "teenager";
        } else if (n <= 65) {
            age = "adult";
        } else if (n >= 66) {
            age = "elder";
        }
        System.out.println(age);
    }
}
