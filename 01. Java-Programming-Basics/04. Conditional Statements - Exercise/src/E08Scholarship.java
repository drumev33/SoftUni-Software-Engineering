import java.util.Scanner;

public class E08Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());
        double minimumIncome = Double.parseDouble(scanner.nextLine());

        double factor = 25.00;

        double socialScholarship = 0.0;
        double scholarship = 0.0;

        if (income < minimumIncome) {
            if (averageGrade >= 4.5) {
                socialScholarship = Math.floor(minimumIncome * 0.35);
            } else if (averageGrade < 4.5) {
                System.out.printf("You cannot get a scholarship!");
            }
        } else if (averageGrade >= 5.5) {
            scholarship = Math.floor(averageGrade * factor);
        } else  if (averageGrade < 5.5) {
            System.out.printf("You cannot get a scholarship!");
        }

        if (socialScholarship > scholarship) {
            System.out.printf("You get a Social scholarship ");
            System.out.printf("%.0f", socialScholarship);
            System.out.printf(" BGN");
        } else if (socialScholarship < scholarship) {
            System.out.printf("You get a scholarship for excellent results ");
            System.out.printf("%.0f", scholarship);
            System.out.printf(" BGN");
        }
    }
}
