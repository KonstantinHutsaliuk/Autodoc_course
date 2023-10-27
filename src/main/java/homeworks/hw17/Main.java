package homeworks.hw17;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        StudentComparatorByGrade studentComparatorByGrade = new StudentComparatorByGrade();
        List<Student> students = new ArrayList<>();

        students.add(new Student("Vasya", 4.5));
        students.add(new Student("Kolya", 3.4));
        students.add(new Student("Stasik", 7.7));
        students.add(new Student("Fedya", 1.1));
        students.add(new Student("Vitya", 9.9));

        students.sort(studentComparatorByGrade);

        for (Student student : students) {
            System.out.println(student);

        }
    }
}
