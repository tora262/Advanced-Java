import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        Student[] students = new Student[10];
        students[0] = new Student();
        for (Student student : students) {
            try {
                student.display();
                return;
            } catch (NullPointerException e) {
                System.out.println(e);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Tràn mảng");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Đã xử lý xong");
            }
        }
    }


}