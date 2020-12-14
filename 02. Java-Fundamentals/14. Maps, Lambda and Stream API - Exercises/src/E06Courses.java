import java.util.*;

public class E06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> userCourses = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] token = input.split(" : ");
            String course = token[0];
            String user = token[1];

            if(!userCourses.containsKey(course)) {
                userCourses.put(course, new LinkedList<>());
            }

            userCourses.get(course).add(user);
            input = scanner.nextLine();
        }

        userCourses.entrySet()
                .stream()
                .sorted((s,i) -> s.getValue().size() - i.getValue().size())
                .forEach(e -> {
                    System.out.println(e.getKey() + ": " + e.getValue().size());
                    e.getValue()
                            .stream()
                            .sorted((f,s) -> f.compareTo(s))
                            .forEach(s -> System.out.println("-- " + s));
                });
    }
}
