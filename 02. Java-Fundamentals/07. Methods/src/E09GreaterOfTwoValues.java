import java.util.Scanner;

public class E09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        if (type.equals("int")) {
            int firstNum = Integer.parseInt(scanner.nextLine());
            int secondNum = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(firstNum, secondNum));
        } else if (type.equals("char")) {
            char first = scanner.nextLine().charAt(0);
            char second = scanner.nextLine().charAt(0);
            System.out.println(getMax(first, second));
        } else if (type.equals("string")) {
            String str = scanner.nextLine();
            String str2 = scanner.nextLine();
            System.out.println(getMax(str, str2));
        }


    }
    private static int getMax(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        }

        return secondNum;
    }
    private static char getMax(char first, char second) {
        int digit1 = first;
        int digit2 = second;
        if (digit1 > digit2) {
            return first;
        }
        return second;
    }
    private static String getMax(String firstStr, String secondStr) {
        if (firstStr.compareTo(secondStr) >= 0) {
            return firstStr;
        }
        return secondStr;
    }
}
