import java.util.Arrays;

public class Extra6 {
    public static void main(String[] args) {
        int[] a = new int[] {42, -13, 69};
        nullAllNegativeNumbers(a);
        Arrays.sort(a);
        printArray(a);
    }

    private static void printArray(int[] printA) {
        for (int i = 0; i < printA.length; i++) {
            System.out.print(printA[i] + " ");
        }
    }

    private static void nullAllNegativeNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
    }
}
