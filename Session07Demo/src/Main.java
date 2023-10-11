import ra.entity.Student;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student student = Student.getStudent();
        System.out.println(Student.uniform);
        System.out.println(student.uniform);
        JavaStudent javaStudent = new JavaStudent();
        javaStudent.toString();

        Student student1 = new Student("Nam", new Student.Mark("Java", "8"));
    }
}