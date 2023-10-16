package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students;

    public StudentService() {
        students = new ArrayList<>();
        students.add(new Student("SV001", "Hieu", true));
        students.add(new Student("SV002", "Thang", true));
    }

    public boolean isStudentExist(Student student) {
        for (Student studentEl : students) {
            if (studentEl.getName().equals(student.getName())) {
                return true;
            }
        }

        return false;
    }

    public Student getStudentByName(String name) {
        for (Student studentEl : students) {
            if (studentEl.getName().equals(name)) {
                return studentEl;
            }
        }

        return null;
    }

    public int countAllStudent() {
        return students.size();
    }

}
