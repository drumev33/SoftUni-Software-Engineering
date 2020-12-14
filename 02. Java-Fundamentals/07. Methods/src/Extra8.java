public class Extra8 {
    public static void main(String[] args) {
        System.out.println(getMax(2, 3));
        System.out.println(getMax(2, 3, 4));
    }

    //Overload
    private static int getMax(int first, int second, int third) {

        return getMax(getMax(first, second), third);
    }

    private static int getMax(int first, int second) {
        if (first > second) {
            return first;
        }
        return second;
    }
}
