package ra.service;

import ra.model.Student;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        /*
        Nếu o1.mark > o2.mark return 1
        Nếu o1.mark == o2.mark return 0
        Nếu o1.mark < o2.mark return -1
         */
        if (o1.getMark() > o2.getMark()) {
            return 1;
        } else if (o1.getMark() == o2.getMark()) {
            return 0;
        } else {
            return -1;
        }
    }
}
