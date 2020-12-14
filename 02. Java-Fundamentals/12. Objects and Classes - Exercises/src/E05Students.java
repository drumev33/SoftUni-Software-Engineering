import java.util.ArrayList;
import java.util.Scanner;

public class E05Students {
    static class Student {
        String firstName;
        String secondName;
        double grade;

        public Student(String firstName, String secondName, double grade) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.grade = grade;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getSecondName() {
            return secondName;
        }

        public double getGrade() {
            return grade;
        }

        public String toString() {
            return String.format("%s %s: %.2f", getFirstName(), getSecondName(), getGrade());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());

        ArrayList<Student> studentList = new ArrayList<>();

        for (int i = 0; i < studentsCount; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String firstName = input[0];
            String lastName = input[1];
            double grade = Double.parseDouble(input[2]);

            Student student = new Student(firstName, lastName, grade);
            studentList.add(student);
        }
        studentList.stream()
                .sorted((s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade()))
                .forEach(student -> System.out.println(student.toString()));
    }
}
