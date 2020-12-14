import java.util.ArrayList;
import java.util.Scanner;

public class Extra2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int number = scanner.nextInt();
        while (number != 0) {
            numbers.add(number);
            number = scanner.nextInt();
        }

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}

/*
1
2 3
4 0 5 1
2 3
*/