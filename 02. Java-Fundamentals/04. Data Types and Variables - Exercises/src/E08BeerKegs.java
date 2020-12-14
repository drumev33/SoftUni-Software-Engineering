import java.util.Scanner;

public class E08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountKegs = Integer.parseInt(scanner.nextLine());

        String whichKegBiggest = "";
        double biggest = Double.MIN_VALUE;

        double sum = 0;

        for (int i = 0; i < amountKegs; i++) {
            String keg = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            sum = Math.PI * (radius * radius) * height;

            if (sum > biggest) {
                biggest = sum;
                whichKegBiggest = keg;
            }
        }
        System.out.printf("%s", whichKegBiggest);
    }
}
