import java.util.Scanner;

public class E06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstString = scanner.nextLine().split(" ");
        int[] numbersFirstString = new int[firstString.length];
        for (int i = 0; i < numbersFirstString.length; i++) {
            numbersFirstString[i] = Integer.parseInt(firstString[i]);
        }

        String[] secondString = scanner.nextLine().split(" ");
        int[] numbersSecondString = new int[secondString.length];
        for (int i = 0; i < secondString.length; i++) {
            numbersSecondString[i] = Integer.parseInt(secondString[i]);
        }

        boolean areEqual = true;
        int differentAtIndex = -1;
        if (numbersFirstString.length == numbersSecondString.length) {
            for (int i = 0; i < numbersFirstString.length; i++) {
                if (numbersFirstString[i] != numbersSecondString[i]) {
                    areEqual = false;
                    differentAtIndex = i;
                    break;
                }
            }
        } else {
           areEqual = false;
        }

        if (areEqual) {
            int sum = 0;
            for (int number : numbersFirstString) {
                sum += number;
            }
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", differentAtIndex);
        }
    }
}
