import java.util.Scanner;

public class E05BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rent = Double.parseDouble(scanner.nextLine());

        double cake = (rent / 100) * 20;
        double drinks = (cake / 100) * 55;
        double animator = (1.0 / 3.0) * rent;

        double result = rent + cake + drinks + animator;

        System.out.printf("%.1f", result);
    }
}
