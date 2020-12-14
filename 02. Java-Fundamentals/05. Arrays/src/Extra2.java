import java.util.Scanner;

public class Extra2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String arrString = scanner.nextLine();

        String[] numbersAsStrings = arrString.split(" ");

        int[] arr = new int[numbersAsStrings.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(numbersAsStrings[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
