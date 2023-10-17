import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class DemoLinearSearching {
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 7, 2, 3, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào một số để tìm kiếm:");
        int searchNumber = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchNumber) {
                System.out.printf("Phần tử %d cần tìm nằm ở vị trí %d", searchNumber, i);
                return;
            }
        }
        System.out.println("Không tìm kiếm được phần tử");

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyen Van A", true));
        students.add(new Student(2, "Tran Thi B", true));
        students.add(new Student(3, "Nguyen Van C", true));
        boolean isNotFound = true;

        System.out.println("Hãy nhập từ khoá tìm kiếm sinh viên:");
        String keyword = scanner.nextLine();
        for (Student student : students) {
            if (student.getName().contains(keyword)) {
                System.out.println(student);
                isNotFound = false;
            }
        }
        if (isNotFound) {
            System.out.println("Không tìm thấy học sinh!");
        }

    }
}