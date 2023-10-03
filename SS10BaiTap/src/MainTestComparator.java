import ra.model.Student;
import ra.service.StudentComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainTestComparator {
    public static void main(String[] args) {
        Comparator<Student> studentComparator = new StudentComparator();
        Student student1 = new Student();
        student1.setStudentId();
        student1.setMark();
        Student student2 = new Student();
        student2.setStudentId();
        student2.setMark();

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        System.out.println("Danh sach hoc sinh:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("Student compare: " + studentComparator.compare(student1, student2));

        Collections.sort(students);
        System.out.println("Danh sach hoc sinh sau sap xep:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
