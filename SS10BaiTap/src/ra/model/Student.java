package ra.model;

import ra.service.StudentService;

import java.util.Scanner;

public class Student implements StudentService, Comparable<Student> {
    private int studentId;
    private String studentName;
    private String address;
    private String phone;
    private boolean gender;
    private double mark;

    public Student() {
    }

    public Student(int studentId, String studentName, String address, String phone, boolean gender, double mark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
        this.mark = mark;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào id học sinh");
        this.studentId = Integer.parseInt(sc.nextLine());
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên học sinh");
        this.studentName = sc.nextLine();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào địa chỉ học sinh");
        this.address = sc.nextLine();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số điện thoại học sinh");
        this.phone = sc.nextLine();
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào giới tính của học sinh (true/false)");
        this.gender = Boolean.parseBoolean(sc.nextLine());
    }

    public double getMark() {
        return mark;
    }

    public void setMark() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào điểm số của học sinh:");
        this.mark = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void input() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Vui lòng nhập vào Id học sinh");
            this.studentId = Integer.parseInt(sc.nextLine());

            System.out.println("Vui lòng nhập vào tên học sinh");
            this.studentName = sc.nextLine();

            System.out.println("Vui lòng nhập vào địa chỉ học sinh");
            this.address = sc.nextLine();

            System.out.println("Vui lòng nhập vào số điện thoại học sinh");
            this.phone = sc.nextLine();

            System.out.println("Vui lòng nhập vào giới tính học sinh (true/false)");
            this.gender = Boolean.parseBoolean(sc.nextLine());

            System.out.println("Vui lòng nhập vào điểm số học sinh");
            this.mark = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void display() {
        System.out.printf("Mã học sinh: %d - Tên học sinh: %s - Địa chỉ: %s - Điện thoại: %s - Giới tính: %s - Điểm: %.2f\n", studentId, studentName, address, phone, gender? "Nam" : "Nữ", mark);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", mark=" + mark +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.getMark() > o.getMark()) {
            return -1;
        } else if (this.getMark() < o.getMark()) {
            return 1;
        } else {
            return 0;
        }
    }
}