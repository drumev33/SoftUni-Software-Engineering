import java.util.Scanner;

public class Extra2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        for (char i = 'a'; i <= 'z'; i++) {
//            System.out.println(i);

        int sum = 0;

            String n = scanner.nextLine();
            for (int j = 0; j < n.length(); j++) {
                int number = n.charAt(j) - 48;
                sum += number;
            }
        System.out.println(sum);
    }
}
