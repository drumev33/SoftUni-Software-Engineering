import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers =
                Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        //5 4 1 8 4 5 6
        ArrayList<Integer> numbersSum = new ArrayList<>();
        for (int i = 0; i < numbers.size() / 2; i++) {
            int current = numbers.get(i);
            int last = numbers.get(numbers.size() - i - 1);
            numbersSum.add(current + last);
        }

        if (numbers.size() % 2 != 0) {
            int oddLastDigit = numbers.get((numbers.size() / 2));
            numbersSum.add(oddLastDigit);
        }
        
        for (int i = 0; i < numbersSum.size(); i++) {
            System.out.print(numbersSum.get(i) + " ");
        }
    }
}
