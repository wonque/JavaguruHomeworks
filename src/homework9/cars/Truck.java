package homework9.cars;

import java.util.Objects;

public class Truck extends Vehicle {

    private double maxLoadCapacity;
    private double currentLoad;

    public Truck(String manufacturer, double powerInHP, double maxSpeed, Engines engineType, double loadCapacity) {
        super(manufacturer, powerInHP, maxSpeed, engineType);
        this.maxLoadCapacity = loadCapacity;
        this.currentLoad = 0.0;
    }

    public void loadTruck() {
        while (canLoad()) {
            currentLoad +=0.5;
        }
    }

    public void unloadTruck() {
        while (!isEmpty() && isStopped()) {
            currentLoad -=0.5;
        }
    }

    public double getCurrentLoad() {
        return currentLoad;
    }

    public double getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public void setCurrentLoad(double currentLoad) {
        this.currentLoad = currentLoad;
    }

    public void setMaxLoadCapacity(double maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
    }

    private boolean isEmpty() {
        return currentLoad == 0;
    }

    private boolean canLoad() {
        return currentLoad < maxLoadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Truck truck = (Truck) o;
        return Double.compare(truck.maxLoadCapacity, maxLoadCapacity) == 0 &&
                Double.compare(truck.currentLoad, currentLoad) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxLoadCapacity, currentLoad);
    }

    @Override
    public String toString() {
        return "TYPE: "+ "Truck{" +
                "maxLoadCapacity=" + maxLoadCapacity +
                ", currentLoad=" + currentLoad +
                '}' + " " + super.toString();
    }
}
