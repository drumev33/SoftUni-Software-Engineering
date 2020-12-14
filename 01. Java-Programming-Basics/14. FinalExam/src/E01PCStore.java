import java.util.Scanner;

public class E01PCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double processor = Double.parseDouble(scanner.nextLine());
        double videoCard = Double.parseDouble(scanner.nextLine());
        double ram = Double.parseDouble(scanner.nextLine());
        double ramAmount = Double.parseDouble(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double processorDisc = processor * discount;
        double videoCardDisc = videoCard * discount;

        double amount = (processor - processorDisc) + (videoCard - videoCardDisc) + (ram * ramAmount);
        double levaAmount = amount * 1.57;

        System.out.printf("Money needed - %.2f leva.", levaAmount);

    }
}
