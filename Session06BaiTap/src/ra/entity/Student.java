package ra.entity;

import java.util.Scanner;

public class Student {
    // 1. Fields
    private int studentId;
    private String studentName;
    private int age;
    private boolean gender;
    private String address;
    private String phoneNumber;

    private static int count = 1;

    // 2. Constructors
    public Student() {
        this.studentId = Student.count++;
    }

    // 3. Methods
    public void inputData(Scanner scanner) {
        System.out.println("Hãy nhập thông tin sinh viên");
        System.out.println("Hãy nhập tên sinh viên:");
        this.studentName = scanner.nextLine();
        System.out.println("Hãy nhập tuổi sinh viên:");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập giới tính sinh viên:");
        this.gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Hãy nhập vào địa chỉ sinh viên:");
        this.address = scanner.nextLine();
        System.out.println("Hãy nhập vào số điện thoại sinh viên:");
        this.phoneNumber = scanner.nextLine();
    }

    public void displayData() {
        String displayData = "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
        System.out.println(displayData);
    }


    // 3.2 Getters and Setters

    public int getStudentId() {
        return studentId;
    }
}
