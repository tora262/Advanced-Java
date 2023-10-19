import ra.models.Student;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = null;
        displayStudent(student);
        try {
            divide();
        } catch (ArithmeticException e) {
            System.out.println("Không thể chia cho 0");
        } catch (Exception e) {
            System.out.println("Lỗi không xác định");
        }
    }

    public static void divide() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 2 số:");
        System.out.println("Nhập vào số a: ");
        Integer a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số b: ");
        Integer b = Integer.parseInt(scanner.nextLine());
        System.out.println("a / b = " + a / b);
    }

    public static void displayStudent(Student student) {
        try {
            student.display();
        } catch (NullPointerException e) {
            System.out.println("Thông tin student bị trống");
        }
    }
}