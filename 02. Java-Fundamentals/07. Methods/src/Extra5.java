import java.util.Scanner;

public class Extra5 {
    public static void main(String[] args) {
        int[] firstArray = readArray();

        for (int number : firstArray) {
            System.out.println(number + " ");
        }
    }

    private static int[] readArray() {
        Scanner scanner = new Scanner(System.in);

        //String line = scanner.nextLine();
        String line = "42 13 69 54 102 153";
        String[] numbersAsStrings = line.split(" ");
        int[] array = new int[numbersAsStrings.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(numbersAsStrings[i]);
        }
        return array;
    }
}
