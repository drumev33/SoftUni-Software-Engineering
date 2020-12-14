import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listIntegers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        String[] str = input.split("\\s+");
        while (!input.equals("end")) {
            int number = Integer.parseInt(str[1]);
            if (str[0].equals("Delete")) {
                for (int i = 0; i < listIntegers.size(); i++) {
                    if (listIntegers.get(i) == number) {
                        listIntegers.remove(Integer.valueOf(number));
                    }
                }
            } else if (str[0].equals("Insert")){
                int index = Integer.parseInt(str[2]);
                if (index < listIntegers.size()){
                    listIntegers.add(index, number);
                }
            }
            input = scanner.nextLine();
            str = input.split("\\s+");
        }

        for (Integer listInteger : listIntegers) {
            System.out.print(listInteger + " ");
        }
    }
}
