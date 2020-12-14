import java.util.Scanner;

public class E04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int hourToMinutes = hour * 60;

        int hourTotal = (min + hourToMinutes + 30) / 60;
        int minutesTotal = (min + hourToMinutes + 30) % 60;

        if (hourTotal >= 24) {
            hourTotal = 0;
        }

        if (minutesTotal < 10) {
            System.out.printf("%d:0%d", hourTotal, minutesTotal);
        } else {
            System.out.printf("%d:%d", hourTotal, minutesTotal);
        }
    }
}
