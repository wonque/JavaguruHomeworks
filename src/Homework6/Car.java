package Homework6;

public class Car {

    private String manufacturer;
    private String model;
    private String color;
    private double maxSpeed;
    private double currentSpeed;

    public Car (String manufacturer, String model, String color) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }




    private double getCurrentSpeed () {
        return currentSpeed;
    }
}
