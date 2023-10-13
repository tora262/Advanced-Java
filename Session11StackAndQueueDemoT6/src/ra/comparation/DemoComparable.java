package ra.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoComparable {
    public static void main(String[] args) {
        Student s1 = new Student(1);
        Student s2 = new Student(2);
        Student s3 = new Student(0);
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        Collections.sort(studentList);

        System.out.println(s1.compareTo(s2) == 0 ?
                "s1 == s2" : (s1.compareTo(s2) > 0 ? "s1 > s2" : "s1 < s2"));

        Student student = Collections.max(studentList);
        System.out.println(student);
    }
}
