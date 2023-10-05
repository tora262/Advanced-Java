package ra.controller;

import ra.entity.Student;

import java.util.Scanner;

public class StudentManagement {
    static Student[] students = new Student[100];
    static int currentIndex = 0;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("*********Student Manangement*********");
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh");
            System.out.println("4. Xoá học sinh");
            System.out.println("5. Thoát");
            System.out.println("-----------------------");
            System.out.println("Hãy nhập lựa chọn của bạn (1-5)");
            int choice = Integer.parseInt(scanner.nextLine());
            handleSelect(choice);
        }
    }

    private static void handleSelect(int choice) {
        switch (choice) {
            case 1:
                displayAllStudent();
                break;
            case 2:
                addStudent();
                break;
            case 3:
                editStudent();
                break;
            case 4:
                deleteStudent();
                break;
            default:
                System.exit(1);
        }
    }

    private static void deleteStudent() {
        System.out.println("Hãy nhập Id của học sinh cần xoá:");
        int deletedId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < currentIndex; i++) {
            if (students[i].getStudentId() == deletedId) {
                for (int j = i; j < currentIndex; j++) {
                    students[j] = students[j + 1];
                }
                currentIndex--;
                return;
            }
        }
        System.out.println("Không tìm thấy học sinh với Id vừa nhập");
    }

    private static void editStudent() {
        System.out.println("Hãy nhập Id của học sinh cần sửa:");
        int editedId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < currentIndex; i++) {
            if (students[i].getStudentId() == editedId) {
                System.out.println("Thông tin của sinh viên mà bạn muốn sửa:");
                students[i].displayData();
                students[i].inputData(scanner);
                System.out.println("Đã cập nhật thông tin sinh viên!");
                return;
            }
        }
        System.out.println("Không tìm thấy học sinh với Id vừa nhập");
    }

    private static void displayAllStudent() {
        System.out.println("Danh sách tất cả sinh viên:");
        for (int i = 0; i < currentIndex; i++) {
            students[i].displayData();
        }
        System.out.println("----------------------");
    }

    private static void addStudent() {
        Student student = new Student();
        student.inputData(scanner);

        students[currentIndex++] = student;
    }
}
