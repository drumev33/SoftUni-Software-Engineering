import java.util.Scanner;

public class E03SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Да се намери сумата на всички въведени прости и сумата на всички въведени непрости числа.
//        Тъй като по дефиниция от математиката отрицателните числа не могат да бъдат прости,
//        ако на входа се подаде отрицателно число да се изведе следното съобщение "Number is negative.".
//        В този случай въведено число се игнорира и не се прибавя към нито една от двете суми, а програмата продължава своето изпълнение, очаквайки
//        въвеждане на следващо число.
//        На изхода да се отпечатат на два реда двете намерени суми в следния формат:
//        "Sum of all prime numbers is: {prime numbers sum}"
//        "Sum of all non prime numbers is: {nonprime numbers sum}"

        int primeNum = 0;
        int nonPrimeNum = 0;

        String input = scanner.nextLine();

        while (!input.equals("stop")) {
            int num = Integer.parseInt(input);
            boolean isPrime = true;

            if (num < 0) {
                System.out.println("Number is negative.");
            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primeNum += num;
                } else {
                    nonPrimeNum += num;
                }
            }

            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeNum);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrimeNum);
    }
}
