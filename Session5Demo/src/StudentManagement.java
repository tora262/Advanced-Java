import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Student student = new Student("Hieu", 27, true);
        student.displayBasicInfo();
        System.out.println(student);
    }
}
