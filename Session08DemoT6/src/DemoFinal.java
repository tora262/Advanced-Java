import ra.models.Car;
import ra.models.User;

public class DemoFinal {
    public static void main(String[] args) {
        User user = new User();
        user.car.setWheelNumber(6);
        user.car.setColor("do");
        System.out.println(user.car.getWheelNumber());
        System.out.println(user.car.getColor());
    }
}
