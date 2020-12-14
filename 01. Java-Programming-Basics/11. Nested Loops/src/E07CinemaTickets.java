import java.util.Scanner;

public class E07CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double student = 0;
        double kid = 0;
        double standard = 0;
        int totalTickets = 0;

        double soldTicketsPerMovie = 0;

        String movieName = scanner.nextLine();
        while (!movieName.equals("Finish")) {

            int freeSpace = Integer.parseInt(scanner.nextLine());
            soldTicketsPerMovie = 0;
            for (int i = 1; i <= freeSpace; i++) {

                String type = scanner.nextLine();
                if (type.equals("student")) {
                    student++;
                }
                if (type.equals("standard")) {
                    standard++;
                }
                if (type.equals("kid")) {
                    kid++;
                }
                if (type.equals("End") || soldTicketsPerMovie > freeSpace) {
                    break;
                }
                soldTicketsPerMovie++;
                totalTickets++;

            }
            double percent = soldTicketsPerMovie / freeSpace * 100;
            System.out.printf("%s - %.2f%% full.%n", movieName, percent);

            movieName = scanner.nextLine();

        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        double studentPercent = student / totalTickets * 100;
        System.out.printf("%.2f%% student tickets.%n", studentPercent);

        System.out.printf("%.2f%% standard tickets.%n", standard / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", kid / totalTickets * 100);
    }
}
