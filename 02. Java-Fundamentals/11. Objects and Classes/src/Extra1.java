import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Extra1 {
    static class Reservation {
        String holderName;
        String phoneNumber;
        int seats;
    }

    public static void main(String[] args) {
        List<Reservation> reservations = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] nameAndSeats = input.split(" ");
            Reservation r = new Reservation();
            r.holderName = nameAndSeats[0];
            r.phoneNumber = nameAndSeats[1];
            r.seats = Integer.parseInt(nameAndSeats[2]);
            reservations.add(r);

            input = scanner.nextLine();
        }

        String guestName = scanner.nextLine();
        int reservationIndex = -1;
        for (int i = 0; i < reservations.size(); i++) {
            Reservation reservation = reservations.get(i);
            if (guestName.equals(reservation.holderName)) {
                reservationIndex = i;
            }
        }
        if (reservationIndex != -1) {
            Reservation reservation = reservations.get(reservationIndex);
            System.out.println(reservation.seats);
        } else {
            System.out.println("Sorry, no reservations for " + guestName);
        }
    }
}