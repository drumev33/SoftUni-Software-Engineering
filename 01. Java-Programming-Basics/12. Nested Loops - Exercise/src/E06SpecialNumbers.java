import java.util.Scanner;

public class E06SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        for (int i = 1111; i <= 9999; i++) {
            String currentNum = "" + i;

            counter = 0;

            for (int j = 0; j < 4; j++) {
                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));
                if (currentDigit == 0) {
                    continue;
                }
                if (n % currentDigit == 0) {
                    counter++;
                } else {

                }
                if (counter == 4) {

                    System.out.print(i + " ");

                }
            }
        }
    }
}
