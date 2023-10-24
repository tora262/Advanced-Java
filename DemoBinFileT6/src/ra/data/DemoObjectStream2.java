package ra.data;

import ra.data.models.Mark;
import ra.data.models.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DemoObjectStream2 {
    public static void main(String[] args) throws IOException {
        List<Mark> marks = new ArrayList<>();
        marks.add(new Mark("Java", 10));
        marks.add(new Mark("SQL", 10));
        Mark[] marks2 = new Mark[2];
        marks.toArray(marks2);
        Student student = new Student(1, "Hieu", 27, true, marks, marks2);

        FileOutputStream fileOutputStream = new FileOutputStream("student.dat");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

        System.out.println("Thực hiện ghi object");
        outputStream.writeObject(student);
        System.out.println("Kết thúc ghi object");
    }
}
