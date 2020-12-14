import java.util.Scanner;

public class E03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbers = scanner.nextLine();

        String[] getEachNumber = numbers.split(" ");

        int sum = 0;

        int[] lengthString = new int[getEachNumber.length];
        for (int i = 0; i < lengthString.length; i++) {
            lengthString[i] = Integer.parseInt(getEachNumber[i]);
        }

        for (int i = 0; i < lengthString.length; i++) {
            if (lengthString[i] % 2 == 0) {
                sum += lengthString[i];
            }
        }
        System.out.println(sum);
    }
}
