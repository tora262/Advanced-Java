package ra.models;

public interface IUser {
    int count = 0;

    String name = "Student";
    String password = "Password";

    default void login(String name, String password) {
        if (this.name.equals(name) && this.password.equals(password)) {
            System.out.println("Đăng nhập thành công");
            this.display();
        } else {
            System.out.println("Đăng nhập thất bại");
        }
    }

    void display();

    static void noti() {
        System.out.println("Thông báo cho tất cả người dùng");
    }
}
