package Homework6;

public class CarTests {

    public static void main(String[] args) {

        Car zaz = new Car("ZAZ", "ZAZ-965", "yellow");

        zaz.accelerate();
        System.out.println(zaz);

        zaz.slowDown();
        System.out.println(zaz);

    }
}
