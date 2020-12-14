import java.util.Scanner;

public class E01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookWanted = scanner.nextLine();
        String books = scanner.nextLine();

        int bookCounter = 0;

        while (!(books.equals(bookWanted))) {
            books = scanner.nextLine();
            bookCounter++;

            if (books.equals("No More Books")) {
                System.out.printf("The book you search is not here!%n");
                System.out.printf("You checked %d books.", bookCounter);
                return;
            }
        }
        System.out.printf("You checked %d books and found it.", bookCounter);
    }
}
