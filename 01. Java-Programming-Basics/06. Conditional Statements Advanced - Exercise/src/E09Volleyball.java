import java.util.Scanner;

public class E09Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String yearType = scanner.nextLine();
        double feast = Double.parseDouble(scanner.nextLine());
        double weekendGone = Double.parseDouble(scanner.nextLine());

        double weekendInSofia = (48 - weekendGone) * 3/4;
        double gamesFeast = feast * 2/3;

        double playTime = 0;

        switch (yearType) {
            case "leap":
                playTime = (weekendInSofia + weekendGone + gamesFeast) * 1.15;
                break;
            case "normal":
                playTime = weekendInSofia + weekendGone + gamesFeast;
                break;
        }
        System.out.printf("%.0f", Math.floor(playTime));

    }
}
