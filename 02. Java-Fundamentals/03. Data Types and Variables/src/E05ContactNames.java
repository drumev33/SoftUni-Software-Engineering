import java.util.Scanner;

public class E05ContactNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String familyName = scanner.nextLine();
        String delimiter = scanner.nextLine();


        System.out.printf("%s%s%s", name, delimiter ,familyName);
    }
}
