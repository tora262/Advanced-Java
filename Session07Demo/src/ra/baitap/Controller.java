package ra.baitap;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào kích thước của hình tròn: ");
        System.out.println("R = ");
        double r = Double.parseDouble(scanner.nextLine());
        System.out.println("Diện tích của hình tròn: " + StaticMethod.calCircleArea(r));
        System.out.println("Hãy nhập vào kích thước của hình chữ nhật: ");
        System.out.println("W = ");
        double w = Double.parseDouble(scanner.nextLine());
        System.out.println("H = ");
        double h = Double.parseDouble(scanner.nextLine());
        System.out.println("Diện tích của hình chữ nhật là: " + StaticMethod.calRectangleArea(w, h));
        System.out.println("Nhập vào kích thước hình tam giác:");
        double a, b, c;
        System.out.println("A = ");
        a = Double.parseDouble(scanner.nextLine());
        System.out.println("B = ");
        b = Double.parseDouble(scanner.nextLine());
        System.out.println("C = ");
        c = Double.parseDouble(scanner.nextLine());
        System.out.println("Diện tích của hình tam giác: " + StaticMethod.calTriangleArea(a, b, c));


    }
}
