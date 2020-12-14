public class Extra3 {
    public static void main(String[] args) {
        printSum(5);
        printSum(69, 5, 10);
        printSum(2, 100, 20012);
    }
    static void printSum (int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}
