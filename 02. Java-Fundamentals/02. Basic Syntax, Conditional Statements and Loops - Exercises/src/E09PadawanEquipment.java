import java.util.Scanner;

public class E09PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double savedMoney = Double.parseDouble(scanner.nextLine());
        int studentsAmount = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        
        int beltCounter = 0;

        double total = 0;


        double lightsaberTotal = Math.ceil(studentsAmount * 1.10) * lightsaberPrice;
        double robeTotal = robePrice * studentsAmount;
        double beltTotal = beltPrice * studentsAmount;

        for (int i = 1; i <= studentsAmount; i++) {

        }

        if (savedMoney > total) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", Math.abs(total - savedMoney));
        }

    }
}
