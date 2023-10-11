package ra.models.impl;

import ra.models.IUser;

public class Student implements IUser, IStudent {
    public void display() {
        System.out.println("Hiển thị với người dùng là " + name + address);
    }

    public void learn() {
        System.out.println("Learning");
    }
}
