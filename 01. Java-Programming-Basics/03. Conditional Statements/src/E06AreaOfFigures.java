import java.util.Scanner;

public class E06AreaOfFigures {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fig = scanner.nextLine();

        String square = "square";
        String rectangle = "rectangle";
        String circle = "circle";
        String triangle = "triangle";

        if (fig.equals(square)){
            double squareArea = Double.parseDouble(scanner.nextLine());
            double resultSquare = squareArea * squareArea;
            System.out.printf("%.3f", resultSquare);
        } else if (fig.equals(rectangle)){
            double rectangleAreaA = Double.parseDouble(scanner.nextLine());
            double rectangleAreaB = Double.parseDouble(scanner.nextLine());
            double resultRect = rectangleAreaA * rectangleAreaB;
            System.out.printf("%.3f", resultRect);
        } else if (fig.equals(circle)){
            double circleArea = Double.parseDouble(scanner.nextLine());
            double resultCirc = (circleArea * circleArea) * Math.PI;
            System.out.printf("%.3f", resultCirc);
        } else if (fig.equals(triangle)){
            double triangleAreaB = Double.parseDouble(scanner.nextLine());
            double triangleAreaH = Double.parseDouble(scanner.nextLine());
            double resultTrian = 0.5 * triangleAreaB * triangleAreaH;
            System.out.printf("%.3f", resultTrian);
        }
    }
}
