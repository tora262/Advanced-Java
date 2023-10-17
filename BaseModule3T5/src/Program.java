import ra.controllers.UserService;
import ra.controllers.fileservice.UserFileService;
import ra.views.UserView;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Program {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        UserFileService userFileService = new UserFileService();
        UserService userService = new UserService(userFileService);
        UserView userView = new UserView(userService);
        userView.loginOrRegister(scanner);
    }
}