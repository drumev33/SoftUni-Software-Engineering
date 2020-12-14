import java.util.Scanner;

public class E01ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade >= 5.00) {
            System.out.println("Excellent!");
        }
    }
}
