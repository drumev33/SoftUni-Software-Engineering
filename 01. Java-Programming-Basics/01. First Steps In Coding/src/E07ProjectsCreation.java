import java.util.Scanner;

public class E07ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());

        int projects = amount * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, projects, amount);

    }
}
