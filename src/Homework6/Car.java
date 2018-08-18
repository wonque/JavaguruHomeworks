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
        //default value
        this.maxSpeed = 250;
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

    public double getCurrentSpeed () {
        return currentSpeed;
    }

    public void accelerate() {
        while(this.canAccelerate()){
            currentSpeed+=1;
        }
    }

    public void slowDown() {
        while(!this.isStopped()){
            currentSpeed-=1;
        }
    }
    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", currentSpeed=" + currentSpeed +
                '}';
    }

    private boolean isStopped() {
        if (currentSpeed==0){
            return true;
        }
        return false;
    }

    private boolean canAccelerate() {
        return currentSpeed < maxSpeed;
    }



}
