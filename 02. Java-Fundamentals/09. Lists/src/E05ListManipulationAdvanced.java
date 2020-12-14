import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        String[] tools = input.split(" ");
        while (!input.equals("end")){
            switch (tools[0]) {
                case "Contains":
                    getContains(numbers, tools);
                    break;
                case "Print":
                    if (tools[1].equals("even")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            int evenNumber = Integer.parseInt(String.valueOf(numbers.get(i)));
                            if (evenNumber % 2 == 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (tools[1].equals("odd")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            int evenNumber = Integer.parseInt(String.valueOf(numbers.get(i)));
                            if (evenNumber % 2 != 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    if (tools[1].equals("sum")) {
                        int sum = 0;
                        for (int i = 0; i < numbers.size(); i++) {
                            sum += numbers.get(i);
                        }
                        System.out.println(sum);
                    }
                    break;
                case "Filter":
                    int toolsAsNum = Integer.parseInt(tools[2]);
                    switch (tools[1]) {
                        case "<":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) < toolsAsNum) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) > toolsAsNum) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) <= toolsAsNum) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) >= toolsAsNum) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
            }

            input = scanner.nextLine();
            tools = input.split(" ");
        }
    }

    static void getContains(List<Integer> numbers, String[] tools) {
        String contains = "";
        boolean notContains = false;
        for (int i = 0; i < numbers.size(); i++) {
            int number = Integer.parseInt(tools[1]);
            int number2 = Integer.parseInt(String.valueOf(numbers.get(i)));
            if (number == number2) {
                notContains = true;
            }
        }

        if (notContains) {
            contains = "Yes";
            System.out.println(contains);
        } else {
            contains = "No such number";
            System.out.println(contains);
        }
    }
}
