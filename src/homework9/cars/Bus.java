package homework9.cars;

import java.util.Objects;

public class Bus extends Vehicle {

    private int passengersCapacity;
    private int passengersInBus;

    public Bus(String manufacturer, double powerInHP, double maxSpeed, Engines engineType, int passengersCapacity) {
        super(manufacturer, powerInHP, maxSpeed, engineType);
        this.passengersCapacity = passengersCapacity;
        this.passengersInBus = 0;
    }

    private boolean isFull() {
        return passengersInBus < passengersCapacity;
    }


    public int getPassengersInBus() {
        return passengersInBus;
    }

    public void pickUpPassengers() {
        if (!isStopped() && !isFull()) {
            slowDown();
            passengersInBus += 1;
            accelerateToAllowedSpeed();
        }
    }

    public void dropPassengers(){
        if(isStopped() && passengersInBus>0){
            passengersInBus-=1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return passengersCapacity == bus.passengersCapacity &&
                passengersInBus == bus.passengersInBus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersCapacity, passengersInBus);
    }

    @Override
    public String toString() {
        return super.toString() + " TYPE: "+ "Bus{" +
                "passengersCapacity=" + passengersCapacity +
                ", passengersInBus=" + passengersInBus +
                '}';
    }
}
