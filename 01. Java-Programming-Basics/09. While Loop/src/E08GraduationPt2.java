import java.util.Scanner;

public class E08GraduationPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0.0;
        int counter = 1;
        int excluded = 0;

        String name = scanner.nextLine();

        while (counter <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4) {
                excluded++;
                if (excluded > 1) {
                    System.out.printf("%s has been excluded at %d grade", name, counter);
                    return;
                }
                continue;
            }
            counter++;
            sum += grade;
        }
        System.out.printf("%s graduated. Average grade: %.2f", name, sum /= 12);
    }
}
