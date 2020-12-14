import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        String[] tools = input.split(" ");
        while (!input.equals("end")) {
            switch (tools[0]) {
                case "Add":
                    int addNumber = Integer.parseInt(tools[1]);
                    numbers.add(addNumber);
                    break;
                case "Remove":
                    int removeNumber = Integer.parseInt(tools[1]);
                    numbers.remove((Integer) removeNumber);
                    break;
                case "RemoveAt":
                    int removeAt = Integer.parseInt(tools[1]);
                    numbers.remove(removeAt);
                    break;
                case "Insert":
                    int setIndex = Integer.parseInt(tools[2]);
                    int setNumber = Integer.parseInt(tools[1]);
                    numbers.add(setIndex, setNumber);
                    break;
            }

            input = scanner.nextLine();
            tools = input.split(" ");
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
