package ra.models;

import ra.models.impl.SportCar;

public class User {
    private String id;
    private String username;
    private String password;

    public final Car car = new SportCar("xanh");

    public User() {
    }

    public User(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public boolean login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            System.out.println("Đăng nhập thành công!");
            return true;
        } else {
            final StringBuilder a = new StringBuilder("abc");
            a.append("cde")
                    .append("EAD");
            System.out.println(a.toString());
            System.out.println("Đăng nhập thất bại");
            return false;
        }
    }

    public void displayData() {
        System.out.printf("Username: %s\n" +
                "Id: %s\n", username, id);
    }
}
