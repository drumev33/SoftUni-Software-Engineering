import java.util.Scanner;

public class E04Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int currentNumb = 1;

        while (currentNumb <= n) {
            System.out.println(currentNumb);
            currentNumb = currentNumb * 2 + 1;
        }
    }
}
