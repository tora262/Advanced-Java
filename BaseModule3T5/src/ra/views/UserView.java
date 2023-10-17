package ra.views;

import ra.constant.Constant;
import ra.controllers.UserService;
import ra.models.User;

import java.util.List;
import java.util.Scanner;

import static ra.constant.Constant.Status.*;

public class UserView {
    private UserService userService;

    public UserView(UserService userService) {
        this.userService = userService;
    }

    public void loginOrRegister(Scanner scanner) {
        System.out.println("Bạn cần đăng nhập hoặc đăng ký để sử dụng dịch vụ");
        System.out.println("Lựa chọn của bạn? (1: Đăng nhập, 2: Đăng ký)");
        int choice = Integer.parseInt(scanner.nextLine());
        User user;
        switch (choice) {
            case 1: //login
                System.out.println("Hãy thực hiện đăng nhập");
                System.out.println("Username:");
                String username = scanner.nextLine();
                System.out.println("Password:");
                String password = scanner.nextLine();
                user = userService.login(username, password);
                if (user != null) {
                    if (user.getRole() == Constant.Role.ADMIN) {
                        displayAdminMenu(scanner);
                    } else {
                        displayUserMenu(scanner, user);
                    }
                } else {
                    System.out.println("Đăng nhập thất bại");
                    loginOrRegister(scanner);
                }
                break;
            case 2: //register
                user = registerUser(scanner);
                userService.saveUser(user);
                loginOrRegister(scanner);
                break;
            default:
        }
    }

    private void displayUserMenu(Scanner scanner, User user) {

    }

    private void displayAdminMenu(Scanner scanner) {
        boolean isLogin = true;
        do {
            System.out.println("**********Admin Menu**********");
            System.out.println("1. Quản lý người dùng");
            System.out.println("2. Quản lý danh mục");
            System.out.println("3. Quản lý sản phẩm");
            System.out.println("4. Quản lý hoá đơn");
            System.out.println("5. Đăng xuất");
            System.out.println("********************");
            System.out.println("Hãy đưa ra lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    userManagement(scanner);
                    break;
                case 2:
                    // TODO
                    break;
                case 3:
                    // TODO
                    break;
                case 4:
                    // TODO
                    break;
                default:
                    isLogin = false;

            }
        } while (isLogin);
        loginOrRegister(scanner);
    }

    private void logout() {

        // TODO
    }

    private void userManagement(Scanner scanner) {
        do {
            System.out.println("**********User Management**********");
            System.out.println("1. Hiển thị danh sách người dùng");
            System.out.println("2. Tìm kiếm người dùng theo tên");
            System.out.println("3. Khoá/mở khoá người dùng");
            System.out.println("4. Thoát màn hình quản lý user");
            System.out.println("Hãy ra lựa chọn của bạn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayUserList();
                    break;
                case 2:
                    displayUserListByUsername(scanner);
                    break;
                case 3:
                    changeUserStatus(scanner);
                default:
                    return;
            }
        } while (true);
    }

    private void changeUserStatus(Scanner scanner) {
        System.out.println("Hãy nhập username bạn muốn thay đổi trạng thái");
        String username = scanner.nextLine();
        System.out.println("Hãy nhập vào trạng thái bạn muốn set cho user (0: BLOCK, 1: ACTIVE)");
        int statusInt = Integer.parseInt(scanner.nextLine());
        userService.setStatusByUsername(statusInt == 0 ? BLOCK : ACTIVE, username);
        System.out.println("Thay đổi trạng thái thành công!");
    }

    private void displayUserListByUsername(Scanner scanner) {
        System.out.println("Nhập từ khoá tên bạn muốn tìm kiếm:");
        String username = scanner.nextLine();
        List<User> filteredUsers = userService.getUserListByUsername(username);
        for (User user : filteredUsers) {
            System.out.println(user);
        }
    }

    private void displayUserList() {
        List<User> sortedUsers = userService.getSortedUserList();
        System.out.println("Danh sách người dùng sắp xếp theo tên:");
        for (User user : sortedUsers) {
            System.out.println(user);
        }
    }

    private User registerUser(Scanner scanner) {
        User user = new User();
        System.out.println("Hãy nhập vào thông tin user:");
        System.out.println("Hãy chọn role của bạn (1: ADMIN 2: USER)");
        user.setRole(Integer.parseInt(scanner.nextLine()));
        System.out.println();
        System.out.println("Hãy nhập vào họ tên đầy đủ");
        user.setFullName(scanner.nextLine());
        System.out.println("Hãy nhập vào username");
        user.setUsername(scanner.nextLine());
        System.out.println("Hãy nhập vào email");
        user.setEmail(scanner.nextLine());
        System.out.println("Hãy nhập vào password");
        user.setPassword(scanner.nextLine());
        System.out.println("Hãy nhập vào địa chỉ");
        user.setAddress(scanner.nextLine());
        System.out.println("Hãy nhập vào số điện thoại");
        user.setPhone(scanner.nextLine());
        user.setId(userService.autoInc());

        return user;
    }

}
