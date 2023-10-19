import ra.service.ProductService;
import ra.util.InOutUtil;
import ra.util.StringFormatter;
import ra.views.ProductManagement;

import java.util.Scanner;

public class Program {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("*********************STORE MANAGEMENT*****************\n" +
                    "1. Quản lý sản phẩm\n" +
                    "2. Quản lý nhân viên\n" +
                    "3. Quản lý phiếu nhập\n" +
                    "4. Quản lý phiếu xuất\n" +
                    "5. Báo cáo thống kê\n" +
                    "6. Thoát");
            System.out.println("Hãy nhập lựa chọn của bạn");
            int choice = InOutUtil.inputInt(scanner);
            ProductManagement productManagement = new ProductManagement(new ProductService());
            switch (choice) {
                case 1:
                    productManagement.displayMenu(scanner);
                    break;
                case 2:
//                employeeManagement.displayMenu(scanner);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(1);
            }
        }
    }
}