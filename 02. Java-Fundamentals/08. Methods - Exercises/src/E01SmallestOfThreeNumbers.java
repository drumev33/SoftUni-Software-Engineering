import java.util.Scanner;

public class E01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println(getSmallestNum(num1, num2, num3));

    }
    static int getSmallestNum(int num1, int num2){
        if (num1 < num2) {
            return num1;
        }

        return num2;
    }
    static int getSmallestNum(int num1, int num2, int num3){
        return getSmallestNum(getSmallestNum(num1, num2), num3);
    }
}
