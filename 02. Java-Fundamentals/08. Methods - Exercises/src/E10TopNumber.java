import java.util.Scanner;

public class E10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            String str = String.valueOf(i);

                if (devisibleByEight(i, str) && oddDigit(i, str)) {
                    System.out.println(i);
                }
            }
        }
    static boolean devisibleByEight (int i, String str) {
        int sum = 0;
        for (int j = 0; j < str.length(); j++) {
            char symbol = str.charAt(j);
            int digit = Integer.parseInt(String.valueOf(symbol));
            sum += digit;
        }
            if (sum % 8 == 0) {
                return true;
            } else {
                return false;
            }
    }
    static boolean oddDigit (int i, String str) {
        int digit = 0;
        for (int j = 0; j < str.length(); j++) {
            char symbol = str.charAt(j);
            digit = Integer.parseInt(String.valueOf(symbol));
        }
        if (digit % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
}

//Working in judge code
/*
import java.util.Scanner;

public class MethodsAndFunctionsExcercise {

    static boolean devisibleByEigth(int num) {

        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        if (sum % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static boolean oddDigit(int num) {

        int counter = 0;
        while (num > 0) {
            if ((num % 10) % 2 == 1) {
                counter++;
            }
            num /= 10;
        }
        if (counter >= 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num ; i++) {
            if (devisibleByEigth(i) && oddDigit(i)) {
                System.out.println(i);
            }
        }
    }
}
*/
