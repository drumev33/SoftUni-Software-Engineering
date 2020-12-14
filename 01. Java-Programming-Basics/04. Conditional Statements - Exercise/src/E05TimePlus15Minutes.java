import java.util.Scanner;

public class E05TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int hour = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());

        int plusMinute = 15;
        int minuteResult = 0;
        int hourResult = 0;

        if (minute < 45) {
            minuteResult = minute + plusMinute;
            hourResult = hour;
            if (hourResult >= 24) {
                hourResult = 0;
            }
            System.out.printf("%d:%d", hourResult, minuteResult);
        } else if (minute < 55) {
            hourResult = hour + 1;
            minuteResult = (minute + plusMinute) - 60;
            if (hourResult >= 24) {
                hourResult = 0;
            }
            System.out.printf("%d:0%d", hourResult, minuteResult);
        } else if (minute < 60) {
            hourResult = hour + 1;
            minuteResult = (minute + plusMinute) - 60;
            if (hourResult >= 24) {
                hourResult = 0;
            }
            System.out.printf("%d:%d", hourResult, minuteResult);
        }
    }
}
