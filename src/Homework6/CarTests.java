package Homework6;

public class CarTests {

    public static void main(String[] args) {

        Car zaz = new Car("ZAZ", "ZAZ-965", "yellow");

        while(zaz.getCurrentSpeed()!= zaz.getMaxSpeed()){
            zaz.accelerate();
        }
        System.out.println(zaz);

        while(zaz.getCurrentSpeed()!=40){
            zaz.slowDown();
        }

        System.out.println(zaz);

    }
}
