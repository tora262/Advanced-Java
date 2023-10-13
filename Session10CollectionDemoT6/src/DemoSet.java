import java.util.HashSet;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Hieu");
        Student student2 = new Student(1, "Hieu");
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);

        System.out.println(studentSet.size());
    }
}
