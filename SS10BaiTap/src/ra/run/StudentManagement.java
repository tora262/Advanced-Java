package ra.run;

import ra.model.Student;

import java.util.*;

public class StudentManagement {
    public static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("*****************************Student Management*****************************");
            System.out.println("1. Thêm mới học sinh");
            System.out.println("2. Sửa thông tin học sinh");
            System.out.println("3. Xóa thông tin học sinh");
            System.out.println("4. Tìm kiếm học sinh theo Id");
            System.out.println("5. Sắp xếp theo tên học sinh từ a-z");
            System.out.println("6. In ra danh sách học sinh");
            System.out.println("7. Sắp xếp điểm tăng dần");
            System.out.println("8. Sắp xếp điểm giảm dần");
            System.out.println("9. Thoát");
            System.out.print("Nhập vào lựa chọn của bạn (1-9): ");
            choice = Integer.parseInt(sc.nextLine());
            if (choice < 1 || choice > 9) {
                System.out.println("Vui lòng nhập vào số trong khoảng từ 1-9");
            } else {
                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        editStudent();
                        break;
                    case 3:
                        deleteStudent();
                        break;
                    case 4:
                        findStudentById();
                        break;
                    case 5:
                        sortStudents();
                        break;
                    case 6:
                        displayStudents();
                        break;
                    case 7:
                        ascendingSortStudentByMark();
                        break;
                    case 8:
                        descendingSortStudentByMark();
                        break;
                    case 9:
                        sc.close();
                        System.exit(0);
                        break;
                }
            }
        } while (true);
    }

    public static void addStudent() {
        Student student = new Student();
        student.input();
        students.add(student);
        System.out.println("Thêm mới học sinh thành công!");
    }

    public static void editStudent() {
        System.out.println("Nhập vào id muốn sửa:");
        Scanner sc = new Scanner(System.in);
        int id = Integer.parseInt(sc.nextLine());
        boolean flag = false;
        for (Student student : students) {
            if (student.getStudentId() == id) {
                flag = true;
                student.setStudentName();
                student.setAddress();
                student.setPhone();
                student.setGender();
                student.setMark();
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy id bạn muốn sửa.");
        }


    }

    public static void deleteStudent() {
        System.out.println("Nhập vào id muốn xóa:");
        Scanner sc = new Scanner(System.in);
        int id = Integer.parseInt(sc.nextLine());
        boolean flag = false;
        Student deleteStudent = new Student();
        for (Student student : students) {
            if (student.getStudentId() == id) {
                flag = true;
                deleteStudent = student;
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy id bạn muốn xóa");
        } else {
            students.remove(deleteStudent);
        }
    }

    public static void findStudentById(){
        System.out.println("Nhập vào id muốn sửa:");
        Scanner sc = new Scanner(System.in);
        int id = Integer.parseInt(sc.nextLine());
        boolean flag = false;
        for (Student student : students) {
            if (student.getStudentId() == id) {
                flag = true;
                student.display();
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy id bạn muốn sửa.");
        }
    }

    public static void sortStudents(){
        Comparator<Student> comparator = new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                return o1.getStudentName().compareTo(o2.getStudentName());
            }
        };
        Collections.sort(students, comparator);

    }

    public static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("Không có thông tin học sinh để hiển thị!");
        } else {
            System.out.println("Danh sách học sinh");
            for (Student student : students) {
                student.display();
                System.out.println("----------------------------------------------------------");
            }
        }
    }

    public static void ascendingSortStudentByMark(){
        Comparator<Student> comparator = new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                return o1.getMark() - o2.getMark() > 0 ? 1 : o1.getMark() - o2.getMark() < 0 ? -1 : 0;
            }
        };
        Collections.sort(students, comparator);
//        for (int i = 0; i < students.size()-1; i++) {
//            for (int j = i+1; j < students.size(); j++) {
//                if (students.get(i).getMark() > students.get(j).getMark()) {
//                    Student tempStudent = students.get(i);
//                    students.set(i, students.get(j));
//                    students.set(j, tempStudent);
//                }
//            }
//        }
    }

    public static void descendingSortStudentByMark(){
        Comparator<Student> comparator = new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                return o1.getMark() - o2.getMark() > 0 ? 1 : o1.getMark() - o2.getMark() < 0? -1 : 0;
            }
        };
        Collections.sort(students, comparator.reversed());
    }
}