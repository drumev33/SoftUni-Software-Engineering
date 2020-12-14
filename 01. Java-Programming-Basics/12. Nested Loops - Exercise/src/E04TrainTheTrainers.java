import java.util.Scanner;

public class E04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double total = 0;
        int counter = 0;
        int firstCounter = 0;
        double endGrade = 0;

        String presentation = scanner.nextLine();

        while (!presentation.equals("Finish")) {

            total = 0;
            firstCounter = 0;
            for (int i = 1; i <= n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                firstCounter++;
                total += grade;
                counter++;
                endGrade += grade;
            }
            total = total / firstCounter;
            System.out.printf("%s - %.2f.%n", presentation, total);
            presentation = scanner.nextLine();
        }
        endGrade = endGrade / counter;
        System.out.printf("Student's final assessment is %.2f.", endGrade);
    }
}
