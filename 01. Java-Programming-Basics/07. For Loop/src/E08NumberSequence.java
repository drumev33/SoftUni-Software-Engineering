import java.util.Scanner;

public class E08NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 1; i <= numbers; i++) {
            int typeNum = Integer.parseInt(scanner.nextLine());

            if (maxNum < typeNum) {
                maxNum = typeNum;
            }
            if (minNum > typeNum) {
                minNum = typeNum;
            }
        }
        System.out.printf("Max number: %d%n", maxNum);
        System.out.printf("Min number: %d%n", minNum);
    }
}
