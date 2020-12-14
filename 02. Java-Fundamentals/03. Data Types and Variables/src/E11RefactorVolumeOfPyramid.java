import java.util.Scanner;

public class E11RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        System.out.printf("Length: ");
        System.out.printf("Width: ");
        System.out.printf("Height: ");

        double sum = (length * width * height) / 3;

        System.out.printf("Pyramid Volume: %.2f", sum);

    }
}
