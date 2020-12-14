import java.util.Scanner;

public class E01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        int[] num = new int[lines];
        for (int i = 0; i < lines; i++) {
            int digit = Integer.parseInt(scanner.nextLine());
            num[i] = digit;
            sum += num[i];
            System.out.print(num[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
