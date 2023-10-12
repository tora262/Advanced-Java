package ra.serialize.models;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 3738385541615715176L;
    private int id;
    private String name;
    private int age;
    private boolean gender;

    public Student() {

    }

    public Student(int id, String name, int age, boolean gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
