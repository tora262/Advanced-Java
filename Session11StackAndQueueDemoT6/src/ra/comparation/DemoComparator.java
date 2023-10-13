package ra.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoComparator {
    public static void main(String[] args) {
        Student s1 = new Student(1);
        Student s2 = new Student(2);
        Student s3 = new Student(0);
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        StudentComparator comparator = new StudentComparator();

        System.out.println(comparator.compare(s1, s2) == 0 ?
                "s1 == s2" : (comparator.compare(s1, s2) > 0 ? "s1 > s2" :"s1 < s2"));

        System.out.println(Collections.max(studentList, comparator));
    }
}
