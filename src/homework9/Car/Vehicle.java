package homework9.Car;

import java.util.Objects;

public class Vehicle {

    private double powerInHP;
    private double currentSpeed;
    private double maxSpeedKMh;
    private String manufacturer;
    private Engines engineType;

    public Vehicle(String manufacturer, double powerInHP, double maxSpeed, Engines engineType) {
        this.manufacturer = manufacturer;
        this.powerInHP = powerInHP;
        this.currentSpeed = 0;
        this.maxSpeedKMh = maxSpeed;
        this.engineType = engineType;
    }

    public boolean isStopped() {
        return currentSpeed == 0;
    }

    public boolean canAccelerate() {
        return currentSpeed < maxSpeedKMh;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }


    public double getPowerInHP() {
        return powerInHP;
    }

    public String getManufacturer(){
        return manufacturer;
    }


    public void accelerateToMaxSpeed() {
        while (canAccelerate()) {
            currentSpeed += 1;
        }
    }

    public void slowDown() {
        while (!isStopped()) {
            currentSpeed -= 1;
        }
    }

    public void accelerateToAllowedSpeed () {
        while(currentSpeed<=50 && canAccelerate()){
            currentSpeed+=1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Double.compare(vehicle.powerInHP, powerInHP) == 0 &&
                Double.compare(vehicle.currentSpeed, currentSpeed) == 0 &&
                Double.compare(vehicle.maxSpeedKMh, maxSpeedKMh) == 0 &&
                Objects.equals(manufacturer, vehicle.manufacturer) &&
                engineType == vehicle.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerInHP, currentSpeed, maxSpeedKMh, manufacturer, engineType);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engineType=" + engineType +
                ", powerInHP=" + powerInHP +
                ", currentSpeed=" + currentSpeed +
                ", maxSpeedKMh=" + maxSpeedKMh +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
