package ra.views;

import ra.controllers.UserService;
import ra.models.User;

import java.util.Scanner;

/*
Đại diện cho tầng View trong mô hình MVC
 */
public class Presentor {
    UserService userService;

    private final int LOGIN = 1;
    private final int REGISTER = 2;

    public Presentor(UserService userService) {
        this.userService = userService;
    }

    public void displayMainMenu(Scanner scanner) {
        if (isLogin(scanner)) {
            System.out.println("*******Main Menu*******");
            System.out.println("1. Quản lý sinh viên");
            System.out.println("2. Quản lý môn học");
            System.out.println("3. Quản lý điểm");
        } else {
            System.out.println("Đăng nhập thất bại");
            displayMainMenu(scanner);
        }
    }

    private boolean isLogin(Scanner scanner) {
        System.out.println("Hãy đăng nhập để sử dụng");
        System.out.println("Đăng ký mới nếu chưa có tài khoản");
        System.out.println("Lựa chọn của bạn? (1: Đăng nhập     2: Đăng ký");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case LOGIN:
                System.out.println("Hãy nhập vào username:");
                String username = scanner.nextLine();
                System.out.println("Hãy nhập vào password:");
                String password = scanner.nextLine();
                return userService.validate(username, password);
            case REGISTER:
                System.out.println("Thực hiện dăng ký mới user");
                User user = new User();
                System.out.println("Hãy nhập username");
                user.setUsername(scanner.nextLine());
                System.out.println("Hãy nhập password");
                user.setPassword(scanner.nextLine());

                if (userService.createUser(user)) {
                    isLogin(scanner);
                } else {
                    System.out.println("Đăng ký thất bại, hãy thử lại");
                    isLogin(scanner);
                }
                break;
            default:
                break;
        }
        return false;
    }
}
