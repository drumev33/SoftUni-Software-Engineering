import java.util.*;

public class E07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> studentMarks = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double mark = Double.parseDouble(scanner.nextLine());

            if (!studentMarks.containsKey(name)) {
                studentMarks.put(name, new ArrayList<>());
            }

            studentMarks.get(name).add(mark);
        }

        studentMarks.entrySet()
                .stream()
                .sorted((f, s) -> {
                   double firstAv = f.getValue()
                           .stream()
                           .mapToDouble(Double::doubleValue)
                           .average()
                           .getAsDouble();

                   double secondAv = s.getValue()
                           .stream()
                           .mapToDouble(Double::doubleValue)
                           .average()
                           .getAsDouble();

                   return Double.compare(secondAv, firstAv);
                }).forEach(s -> {
                    double average = s.getValue()
                            .stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .getAsDouble();
                    if (average >= 4.50) {
                        System.out.printf("%s -> %.2f%n",s.getKey(), average);
                    }
        });
    }
}
