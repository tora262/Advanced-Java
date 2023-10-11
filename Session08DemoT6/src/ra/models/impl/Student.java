package ra.models.impl;

import ra.models.User;

public class Student extends User {
    private String subject;

    public Student(String id, String username, String password, String subject) {
        super(id, username, password);
        this.subject = subject;
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Subject: " + subject);
    }

    public void displayData(String message) {
        super.displayData();
        System.out.println(message);
        displayData();
    }
}
