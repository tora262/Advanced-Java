package treemap;

import java.util.Map;
import java.util.TreeMap;

public class DemoTreeMap {
    public static void main(String[] args) {
        StudentComparator comparator = new StudentComparator();
        Map<Student, Student> studentMap = new TreeMap<>();

        Student student1 = new Student(1);
        Student student2 = new Student(2);
        studentMap.put(student2, student2);
        studentMap.put(student1, student1);
    }
}
