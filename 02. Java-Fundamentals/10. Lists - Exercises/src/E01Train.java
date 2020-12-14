import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfWagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int wagonCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        String[] str = input.split(" ");
        while (!input.equals("end")) {
            if (str[0].equals("Add")) {
                int addWagon = Integer.parseInt(str[1]);
                listOfWagons.add(addWagon);
            } else {
                int addPeople = Integer.parseInt(str[0]);
                for (int i = 0; i < listOfWagons.size(); i++) {
                    int number = listOfWagons.get(i);
                    if (listOfWagons.get(i) + addPeople <= wagonCapacity) {
                        listOfWagons.set(i, listOfWagons.get(i) + addPeople);
                        break;
                    }
                }
            }
            
            input = scanner.nextLine();
            str = input.split(" ");
        }

        for (int i = 0; i < listOfWagons.size(); i++) {
            System.out.print(listOfWagons.get(i) + " ");
        }
    }
}
