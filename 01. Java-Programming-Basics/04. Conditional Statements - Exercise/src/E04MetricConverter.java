import java.util.Scanner;

public class E04MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());

        String unit = scanner.nextLine();
        String unitResult = scanner.nextLine();

        if (unit.equals("mm")) {
            num = num / 1000;
        } else if (unit.equals("cm")){
            num = num / 100;
        }

        if (unitResult.equals("mm")) {
            num = num * 1000;
        } else if (unitResult.equals("cm")){
            num = num * 100;
        }
        System.out.printf("%.3f", num);
    }
}
