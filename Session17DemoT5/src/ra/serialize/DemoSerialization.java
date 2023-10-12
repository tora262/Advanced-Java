package ra.serialize;

import ra.serialize.models.Student;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DemoSerialization {
    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Hoang", 18, true));
        students.add(new Student(2, "Nam", 30, true));

        File file = new File("student.txt");
        if (file.createNewFile()) {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            for (Student student : students) {
                outputStream.writeObject(student);
            }
            outputStream.close();
            System.out.println("Ghi file thành công!");
        } else {
            System.out.println("Tạo file không thành công");
        }
    }
}
