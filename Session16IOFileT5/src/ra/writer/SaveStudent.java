package ra.writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SaveStudent {
    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Hoang"));
        students.add(new Student(2, "Nam"));

        File studentFile = new File("list-student.txt");
        if (studentFile.createNewFile()) {
            System.out.println("Đã tạo file thành công");
            FileWriter fileWriter = new FileWriter(studentFile);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            for (Student student : students) {
                writer.write(student.toString());
                writer.newLine();
            }
            writer.close();
            System.out.println("Đã ghi thông tin thành công!");
        }
    }
}
