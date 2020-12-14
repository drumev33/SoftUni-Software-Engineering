import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersOne = 
                Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        
        List<Integer> numberTwo =
                Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        ArrayList<Integer> mergedNumbers = new ArrayList<>();

        int indexInFirst = 0;
        int indexInSecond = 0;

        while (indexInFirst < numbersOne.size() || indexInSecond < numberTwo.size()) {
            if (indexInFirst < numbersOne.size()) {
                mergedNumbers.add(numbersOne.get(indexInFirst));
            }
            if (indexInSecond < numberTwo.size()) {
                mergedNumbers.add(numberTwo.get(indexInSecond));
            }

            indexInFirst++;
            indexInSecond++;
        }

        for (int i = 0; i < mergedNumbers.size(); i++) {
            System.out.print(mergedNumbers.get(i) + " ");
        }
    }
}
