package ra.models;

public class Car {
    protected int wheelNumber = 4;
    protected String color;
    protected void movement() {
        System.out.println("Movement");
    }

    public Car(String color) {
        this.color = color;
        System.out.println("Xe này có màu " + this.color);
    }

    public Car() {

    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
