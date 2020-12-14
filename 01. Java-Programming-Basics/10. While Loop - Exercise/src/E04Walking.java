import java.util.Scanner;

public class E04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goalSteps = 10000;

        int stepsSum = 0;

        while (!(stepsSum >= goalSteps)) {
            String text = scanner.nextLine();
            if (text.equals("Going home")) {
                stepsSum += Integer.parseInt(scanner.nextLine());
                if (stepsSum < goalSteps) {
                    System.out.printf("%d more steps to reach goal.", Math.abs(stepsSum - goalSteps));
                } else {
                    System.out.println("Goal reached! Good job!");
                    System.out.printf("%d steps over the goal!", Math.abs(stepsSum - goalSteps));
                }
                return;
            }
            int stepsDone = Integer.parseInt(text);
            stepsSum += stepsDone;
        }
        System.out.println("Goal reached! Good job!");
        System.out.printf("%d steps over the goal!", Math.abs(stepsSum - goalSteps));
    }
}
