import java.util.Scanner;

public class E03SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int numberSum = 0;

        while (!(numberSum >= n)) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            numberSum += currentNum;
        }
        System.out.println(numberSum);
    }
}
