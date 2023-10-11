package ra.models.impl;

import ra.models.Car;

public class SportCar extends Car {
    public SportCar(String color) {
        super(color);
    }
    public void test() {
        if (wheelNumber == 4) {
            System.out.println("Test số lượng bánh xe OK");
        }
        movement();
    }
}
