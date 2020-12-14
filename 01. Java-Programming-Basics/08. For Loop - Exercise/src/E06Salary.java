import java.util.Scanner;

public class E06Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < tabs; i++) {
            String currentTabs = scanner.nextLine();

            if (currentTabs.equals("Facebook")) {
                salary -= 150;
            } else if (currentTabs.equals("Instagram")) {
                salary -= 100;
            } else if (currentTabs.equals("Reddit")) {
                salary -= 50;
            }
        }
        if (salary <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }
    }
}
