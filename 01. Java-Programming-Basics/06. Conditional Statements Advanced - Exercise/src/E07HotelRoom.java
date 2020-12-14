import java.util.Scanner;

public class E07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double resultApt = 0;
        double resultStud = 0;
        double studio = 0;
        double apartment = 0;

        switch (month) {
            case "May":
            case "October":
                studio = 50;
                apartment = 65;
                break;
            case "June":
            case "September":
                studio = 75.20;
                apartment = 68.70;
                break;
            case "July":
            case "August":
                studio = 76;
                apartment = 77;
                break;
        }

        if ((nights > 7 && nights < 14) && (month.equals("May") || month.equals("October"))) {
            studio *= 0.95;
        }  else if (nights > 14 && month.equals("May") || month.equals("October")) {
            studio *= 0.70;
        } else if (nights > 14 && month.equals("June") || month.equals("September")) {
            studio *= 0.80;
        }

        if (nights > 14) {
            apartment *= 0.9;
        }

        resultApt = apartment * nights;
        resultStud = studio * nights;
        System.out.printf("Apartment: %.2f lv.", resultApt);
        System.out.println();
        System.out.printf("Studio: %.2f lv.", resultStud);
    }
}
