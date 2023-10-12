package ra.serialize;

import ra.serialize.models.Student;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoDeserialization {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Đọc từ file student.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream("student.txt");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

            Student student = (Student) inputStream.readObject();

            while (true) {
                System.out.println(student);
                student = (Student) inputStream.readObject();
            }
        } catch (EOFException e) {
            System.out.println("Quá trình đọc file kết thúc");

        } catch (IOException e) {
            System.out.println("Đã có lỗi xảy ra khi đọc file");

        } catch (ClassNotFoundException e) {
            System.out.println("Định dạng dữ liệu đọc được không phù hợp");

        } finally {

        }
    }
}
