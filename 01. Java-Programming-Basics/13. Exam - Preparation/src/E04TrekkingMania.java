import java.util.Scanner;

public class E04TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        double musala = 0;
        double monblan = 0;
        double kilimandjaro = 0;
        double k2 = 0;
        double everest = 0;

        double peopleTotal = 0;

        for (int i = 1; i <= groups; i++) {
            int peepAmount = Integer.parseInt(scanner.nextLine());

            if (peepAmount <= 5) {
                musala += peepAmount;
            } else if (peepAmount <= 12) {
                monblan += peepAmount;
            } else if (peepAmount <= 25) {
                kilimandjaro += peepAmount;
            } else if (peepAmount <= 40) {
                k2 += peepAmount;
            } else {
                everest += peepAmount;
            }

            peopleTotal += peepAmount;

        }
        System.out.printf("%.2f%%%n", 100 / peopleTotal * musala);
        System.out.printf("%.2f%%%n", 100 / peopleTotal * monblan);
        System.out.printf("%.2f%%%n", 100 / peopleTotal * kilimandjaro);
        System.out.printf("%.2f%%%n", 100 / peopleTotal * k2);
        System.out.printf("%.2f%%", 100 / peopleTotal * everest);
    }
}
