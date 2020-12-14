import java.util.Scanner;

public class E04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());

        int result = 0;

        for (int i = startNum; i <= endNum; i++) {
            System.out.print(i + " ");
            result += i;
        }
        System.out.println();
        System.out.printf("Sum: %d", result);
    }
}
