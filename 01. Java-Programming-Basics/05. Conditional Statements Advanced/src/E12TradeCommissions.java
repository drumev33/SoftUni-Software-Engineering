import java.util.Scanner;

public class E12TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        double commission = 0.0;

        if (city.equals("Sofia")){
            if (sales > 0 && sales <= 500) {
                commission = sales * 0.05;
                System.out.printf("%.2f", commission);
            } else if (sales > 0 && sales <= 1000) {
                commission = sales * 0.07;
                System.out.printf("%.2f", commission);
            } else if (sales > 0 && sales <= 10000) {
                commission = sales * 0.08;
                System.out.printf("%.2f", commission);
            } else if (sales > 0 && sales > 10000) {
                commission = sales * 0.12;
                System.out.printf("%.2f", commission);
            } else {
                System.out.println("error");
            }

        } else if (city.equals("Varna")){
            if (sales > 0 && sales <= 500) {
                commission = sales * 0.045;
                System.out.printf("%.2f", commission);
            } else if (sales > 0 && sales <= 1000) {
                commission = sales * 0.075;
                System.out.printf("%.2f", commission);
            } else if (sales > 0 && sales <= 10000) {
                commission = sales * 0.1;
                System.out.printf("%.2f", commission);
            } else if (sales > 0 && sales > 10000) {
                commission = sales * 0.13;
                System.out.printf("%.2f", commission);
            } else {
                System.out.println("error");
            }

        } else if (city.equals("Plovdiv")) {
            if (sales > 0 && sales <= 500) {
                commission = sales * 0.055;
                System.out.printf("%.2f", commission);
            } else if (sales > 0 && sales <= 1000) {
                commission = sales * 0.08;
                System.out.printf("%.2f", commission);
            } else if (sales > 0 && sales <= 10000) {
                commission = sales * 0.12;
                System.out.printf("%.2f", commission);
            } else if (sales > 0 && sales > 10000) {
                commission = sales * 0.145;
                System.out.printf("%.2f", commission);
            } else {
                System.out.println("error");
            }

        } else {
            System.out.println("error");
        }
    }
}
