import java.util.Scanner;

public class E08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int hourArrival = Integer.parseInt(scanner.nextLine());
        int minArrival = Integer.parseInt(scanner.nextLine());

        int totalMinutes = hour * 60 + min;
        int totalArrivalMinutes = hourArrival * 60 + minArrival;

        int minHelp = 0;
        int hourHelp = 0;

        if (totalMinutes == totalArrivalMinutes) { //on time
            System.out.println("On time");
        } else if (totalMinutes > totalArrivalMinutes) { //early
            minHelp = totalMinutes - totalArrivalMinutes;
            if (minHelp <= 30) {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", minHelp);
            } else if (minHelp < 60){
                System.out.println("Early");
                System.out.printf("%d minutes before the start", minHelp);
            } else {
                System.out.println("Early");
                hourHelp = minHelp / 60;
                minHelp %= 60;
                System.out.printf("%d:%02d hours before the start", hourHelp, minHelp);
            }
        } else { //late
            System.out.println("Late");
            minHelp = totalArrivalMinutes - totalMinutes;
            if (minHelp < 60) {
                System.out.printf("%d minutes after the start", minHelp);
            } else {
                hourHelp = minHelp / 60;
                minHelp %= 60;
                System.out.printf("%d:%02d hours after the start", hourHelp, minHelp);
            }
        }
    }
}
