import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E06Students2 {
    static class Student {
        String firstName;
        String lastName;
        int age;
        String hometown;

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getHometown() {
            return hometown;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] dataStudents = input.split("\\s+");

            String firstName = dataStudents[0];
            String lastName = dataStudents[1];
            int age = Integer.parseInt(dataStudents[2]);
            String hometown = dataStudents[3];

            Student studentClass = new Student();

            studentClass.setFirstName(firstName);
            studentClass.setLastName(lastName);
            studentClass.setAge(age);
            studentClass.setHometown(hometown);

            int existingIndex = findStudentIndex(students, studentClass.getFirstName(), studentClass.getLastName());
            if (existingIndex != -1) {
                students.get(existingIndex).setHometown(studentClass.hometown);
                students.get(existingIndex).setAge(studentClass.age);
            } else {
                students.add(studentClass);
            }

         input = scanner.nextLine();
        }

        String city = scanner.nextLine();
        for (Student student : students) {
            if (student.getHometown().equals(city)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
    static int findStudentIndex(List<Student> students, String firstName, String lastName) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFirstName().equals(firstName)
                    && students.get(i).getLastName().equals(lastName)) {
                return i;
            }
        }

        return -1;
    }
}
