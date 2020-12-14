import java.util.Scanner;

public class Extra4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "Hello and goodbye";
        int currentIndex = text.indexOf("o");
        while (currentIndex != -1) {
            System.out.println(currentIndex);
            currentIndex = text.indexOf("o", currentIndex + 1);
        }

        System.out.println(text.contains("Hello"));


//        int firstIndex = text.indexOf("o");
//        int secondIndex = text.indexOf("o", firstIndex + 1);
//        int thirdIndex = text.indexOf("o", secondIndex + 1);
//        System.out.println(firstIndex);
//        System.out.println(secondIndex);
//        System.out.println(thirdIndex);

//        for (int i = 0; i < text.length(); i++) {
//            if (text.charAt(i) == 'o') {
//                System.out.println(i);
//            }
//        }
    }
}
