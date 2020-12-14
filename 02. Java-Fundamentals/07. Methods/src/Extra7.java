public class Extra7 {
    public static void main(String[] args) {
        int a = 42;
        int b = 13;

        b = a;
        b = 69;

        System.out.println(a);
        System.out.println(b);

        System.out.println("--------------------------");

        //This is because arrayA && arrayB points to the same RAM memory
        int[] arrayA = new int[] {42};
        int[] arrayB= arrayA;
        arrayB[0] = 69;

        printArray(arrayA);
        printArray(arrayB);

    }

    private static void printArray(int[] printA) {
        for (int i = 0; i < printA.length; i++) {
            System.out.println(printA[i] + " ");
        }
    }

}
