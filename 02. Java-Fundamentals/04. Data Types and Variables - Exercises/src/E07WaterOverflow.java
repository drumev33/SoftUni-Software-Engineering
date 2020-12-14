import java.util.Scanner;

public class E07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        int capacity = 255;

        int literInTank = 0;

        for (int i = 0; i < numberOfLines; i++) {
            int pourLiters = Integer.parseInt(scanner.nextLine());
            literInTank += pourLiters;
            if (capacity >= pourLiters && literInTank <= capacity) {
            } else {
                System.out.println("Insufficient capacity!");
                literInTank -= pourLiters;
            }
        }
        System.out.println(literInTank);
    }
}
