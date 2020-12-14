import java.math.BigInteger;
import java.util.Scanner;

public class E02SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger fN = new BigInteger(scanner.nextLine());
        BigInteger sN = new BigInteger(scanner.nextLine());

        BigInteger sum = fN.add(sN);

        System.out.println(sum);
    }
}
