import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] number = scanner.nextLine().split("\\s+");

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tools = input.split("\\s+");

            switch (tools[0]) {
                case "reverse":
                    int start = Integer.parseInt(tools[2]);
                    int end = Integer.parseInt(tools[4]);
                    
                    break;
                case "sort":
                    start = Integer.parseInt(tools[2]);
                    end = Integer.parseInt(tools[4]);
                    break;
                case "remove":
                    int countRemove = Integer.parseInt(tools[1]);
                    for (int i = countRemove; i < number.length; i++) {
                        if (i == number.length - 1) {
                            System.out.print(number[i]);
                        } else {
                            System.out.print(number[i] + ", ");
                        }
                    }
                    return;
            }


            input = scanner.nextLine();
        }

        for (int i = 0; i < number.length; i++) {
            if (i == number.length - 1) {
                System.out.print(number[i]);
            } else {
                System.out.print(number[i] + ", ");
            }
        }
    }

    static void reverseArray() {

    }
}
