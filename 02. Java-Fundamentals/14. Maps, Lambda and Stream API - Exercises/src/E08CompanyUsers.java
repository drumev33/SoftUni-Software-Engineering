import java.util.*;

public class E08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> map = new TreeMap<>();

        while (!input.equals("End")) {
            String[] token = input.split(" -> ");
            String company = token[0];
            String serialNumber = token[1];

            map.putIfAbsent(company, new ArrayList<>());

            if (map.containsKey(company) && !map.get(company).contains(serialNumber)) {

                map.get(company).add(serialNumber);
            }


          input = scanner.nextLine();
        }

        map.entrySet().forEach(e -> {
                    System.out.println(e.getKey());
                    e.getValue()
                            .stream()
                            .forEach(s -> System.out.println("-- " + s));
                });
    }
}
