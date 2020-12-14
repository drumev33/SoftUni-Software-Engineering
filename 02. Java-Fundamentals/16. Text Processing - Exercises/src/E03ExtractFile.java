import java.util.Scanner;

public class E03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        String[] input = scanner.nextLine().split("\\\\");
        String[] str = input[input.length - 1].split("\\.");

        String fname = str[0];
        System.out.println("File name: " + fname);
        
        String ename = str[1];
        System.out.println("File extension: " + ename);
        */

        String path = scanner.nextLine();
        String file = path.substring(path.lastIndexOf("\\") + 1);

        String name = file.substring(0, file.indexOf("."));
        String extension = file.substring(file.indexOf(".") + 1);

        System.out.println("File name: " + name);
        System.out.println("File extension: " + extension);

    }
}

