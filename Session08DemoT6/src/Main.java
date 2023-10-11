import ra.models.Car;
import ra.models.User;
import ra.models.impl.SportCar;
import ra.models.impl.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        SportCar sportCar = new SportCar("xanh");
//        sportCar.test();

        //declared type    //actual type
        User student = new Student("SV001", "hieutt", "12345678", "Java");
        // decoupling
        Scanner scanner = new Scanner(System.in);
        boolean isLogin = false;
        while (!isLogin) {
            System.out.println("Thực hiện đăng nhập");
            System.out.println("Hãy nhập username: ");
            String username = scanner.nextLine();
            System.out.println("Hãy nhập password:");
            String password = scanner.nextLine();
            if (student.login(username, password)) {
                student.displayData();
                isLogin = true;
            }
        }
    }
}