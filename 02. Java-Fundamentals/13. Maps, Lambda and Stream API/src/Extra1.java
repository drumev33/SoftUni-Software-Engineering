import java.util.*;

public class Extra1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> cityNames = new ArrayList<String>();

        Map<String, Integer> infectedByCity = new HashMap<>();

        cityNames.add("Gabrovo");

        int firstDay = 15;
        int secondDay = 30;

        Integer current = infectedByCity.get("Gabrovo");
        if (current == null) {
            current = 0;
        }
        infectedByCity.put("Gabrovo", current + firstDay);

        current = infectedByCity.get("Gabrovo");
        if (current == null) {
            current = 0;
        }
        infectedByCity.put("Gabrovo", current + secondDay);

        System.out.println(infectedByCity.get("Gabrovo"));
    }
}
