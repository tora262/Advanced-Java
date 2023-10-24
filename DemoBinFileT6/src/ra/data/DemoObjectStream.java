package ra.data;

import ra.data.models.Student;

import java.io.*;

public class DemoObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Ghi vào file student.dat");
        FileOutputStream fileOutputStream = new FileOutputStream("student.dat");
        BufferedOutputStream bos = new BufferedOutputStream(fileOutputStream);
        ObjectOutputStream outputStream = new ObjectOutputStream(bos);
        Student student = new Student(1, "Hieu", 27, true);
        outputStream.writeObject(student);
        outputStream.close();
        System.out.println("Ghi thành công!");

        System.out.println("Thực hiện đọc từ file");
        FileInputStream fileInputStream = new FileInputStream("student.dat");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        Student student1 = (Student) inputStream.readObject();
        System.out.println(student1);
        inputStream.close();
        System.out.println("Kết thúc đọc file");
    }
}
