package ra.models.impl;

import ra.models.IUser;

public interface IStudent extends IUser {
    String address = "Hanoi";
    void learn();

    void display();
}
