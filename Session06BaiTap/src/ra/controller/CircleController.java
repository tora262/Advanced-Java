package ra.controller;

import ra.entity.Circle;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CircleController {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.inputData();
        circle.displayData();
        double chuVi = circle.tinhChuVi();
        System.out.println("Chu vi của hình tròn là: " + chuVi);
        double dienTich = circle.tinhDienTich();
        System.out.println("Diện tích của hình tròn là: " + dienTich);

        Circle circle1 = new Circle();
        circle1.displayData();
        circle1.getRadius();
        circle1.setRadius(5.8);
        circle1.setColor("Green");
        circle1.displayData();
        chuVi = circle1.tinhChuVi();
        System.out.println("Chu vi của hình tròn là: " + chuVi);
        dienTich = circle1.tinhDienTich();
        System.out.println("Diện tích của hình tròn là: " + dienTich);
    }
}