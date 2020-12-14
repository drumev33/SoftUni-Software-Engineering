import java.util.ArrayList;
import java.util.Scanner;

public class E07OrderByAge {
    static class Person {
        String name;
        String id;
        int age;

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public int getAge() {
            return age;
        }

        public String toString() {
            return String.format("%s with ID: %s is %d years old.",
                    getName(),
                    getId(),
                    getAge());
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayList<Person> personList = new ArrayList<>();

        while (!input.equals("End")) {
            String[] data = input.split("\\s+");
            String name = data[0];
            String id = data[1];
            int age = Integer.parseInt(data[2]);

            Person person = new Person(name, id, age);
            personList.add(person);

            input = scanner.nextLine();
        }
        personList.stream()
                .sorted((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()))
                .forEach(person -> System.out.println(person.toString()));
    }
}
