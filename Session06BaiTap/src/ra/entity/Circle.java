package ra.entity;

import java.util.Scanner;

public class Circle {
    // 1. Fields
    private Double radius;
    private String color;

    private Double PI = 3.14;

    // 2. Constructors
    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // 3. Methods
    // 3.1 Getters and Setters

    public Double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double tinhChuVi() {
        return 2 * Math.PI * this.radius;
    }

    public double tinhDienTich() {
        return Math.PI * this.radius * this.radius;
    }

    public void displayData() {
        System.out.println("Hình tròn có các thuộc tính là: Bán kính = " + this.radius + ", màu sắc: " + this.color );
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào thông tin bán kính:");
        this.radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Hãy nhập vào thông tin màu sắc:");
        this.color = scanner.nextLine();
    }
}
