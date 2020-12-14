import java.util.Scanner;

public class E01ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bitcoin = Double.parseDouble(scanner.nextLine());
        double chineseIoan = Double.parseDouble(scanner.nextLine());
        double comission = Double.parseDouble(scanner.nextLine());

        double bitcoinToLV = 0;
        double yoanToLv = 0;
        double comissionPercent = 0;
        double total = 0;

        bitcoinToLV = bitcoin * 1168;
        yoanToLv = (chineseIoan * 0.15) * 1.76;
        comissionPercent = (100 - comission) / 100;
        total = ((bitcoinToLV + yoanToLv) / 1.95) * comissionPercent;


        System.out.printf("%.2f", total);
    }
}
