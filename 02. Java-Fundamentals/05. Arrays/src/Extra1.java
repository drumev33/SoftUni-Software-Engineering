import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Fastest methode to store value ARRAY
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }



        // Long Array methode
//        numbers[0] = scanner.nextInt();
//        numbers[1] = scanner.nextInt();
//        numbers[2] = scanner.nextInt();
//        numbers[3] = scanner.nextInt();
//        numbers[4] = scanner.nextInt();
//
//        System.out.println(numbers[4]);
//        System.out.println(numbers[3]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[0]);


//        This is the methode without arrays

//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        int d = scanner.nextInt();
//        int e = scanner.nextInt();
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);

    }
}
