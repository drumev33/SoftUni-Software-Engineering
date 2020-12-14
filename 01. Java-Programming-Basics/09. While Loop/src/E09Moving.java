import java.util.Scanner;

public class E09Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int space = width * length * height;

        int boxes = 0;

        int result = 0;

        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            int currentBoxes = Integer.parseInt(input);
            boxes += currentBoxes;
            result = Math.abs(space - boxes);

            if (boxes > space) {
                System.out.printf("No more free space! You need %d Cubic meters more.", result);
                return;
            }
            input = scanner.nextLine();
        }
        System.out.printf("%d Cubic meters left.", result);
    }
}
