package ra.baitap;

public class StaticMethod {
    private static double PI = 3.14;

    public static double calCircleArea(double radius) {
        return PI * radius * radius;
    }

    public static double calRectangleArea(double width, double height) {
        return width * height;
    }

    public static double calTriangleArea(double a, double b, double c) {
        double halfDiameter = (a + b + c) / 2;
        return Math.sqrt(halfDiameter * (halfDiameter - a) * (halfDiameter - b) * (halfDiameter - c));
    }
}
