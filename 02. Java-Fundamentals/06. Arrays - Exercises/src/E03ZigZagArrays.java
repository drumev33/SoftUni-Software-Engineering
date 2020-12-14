import java.util.Scanner;

public class E03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());


        String[] arr2 = new String[lines];
        String[] arr3 = new String[lines];
        for (int i = 0; i < lines; i++) {
            String[] arr1 = scanner.nextLine().split(" ");

            if (i % 2 != 0) {
                arr2[i] = arr1[1];
            } else {
                arr3[i] = arr1[1];
            }

            if (i % 2 == 0) {
                arr2[i] = arr1[0];
            } else {
                arr3[i] = arr1[0];
            }

        }
        for (int j = 0; j < lines; j++) {
            System.out.print(arr2[j] + " ");
        }
        System.out.println();
        for (int i = 0; i < lines; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
