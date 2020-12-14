import java.util.Scanner;

public class E04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int pagesBook = Integer.parseInt(scanner.nextLine());
        int pph = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int result = (pagesBook / pph) / days;

        System.out.println(result);
    }
}
