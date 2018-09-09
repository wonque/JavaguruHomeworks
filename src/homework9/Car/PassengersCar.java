package homework9.Car;

import java.util.Objects;

public class PassengersCar extends Vehicle {

    private BodyTypes bodyType;
    private int passengersAllowed;
    private int passengersOnBoard;

    public PassengersCar (String manufacturer, double powerInHP, double maxSpeed, Engines engineType, BodyTypes bodyType){
        super(manufacturer,powerInHP,maxSpeed,engineType);
        this.bodyType = bodyType;
        this.passengersAllowed = bodyType.getPassengersCount();
        this.passengersOnBoard = 0;
    }

    public BodyTypes getBodyType() {
        return bodyType;
    }

    public int getPassengersAllowed () {
        return passengersAllowed;
    }

    public int getPassengersOnBoard() {
        return passengersOnBoard;
    }

    private boolean isAllowedToPickPassenger (){
        return passengersOnBoard < passengersAllowed;
    }

    public void pickUpPassengers (){
        if(isAllowedToPickPassenger() && isStopped()){
            passengersOnBoard+=1;
        }
    }

    public void dropPassengers (){
        if(isStopped() && passengersOnBoard>0){
            passengersOnBoard-=1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassengersCar that = (PassengersCar) o;
        return Objects.equals(bodyType, that.bodyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bodyType);
    }

    @Override
    public String toString() {
        return "TYPE: "+ "PassengersCar{" +
                "bodyType='" + bodyType + "', passengersAllowed='" + passengersAllowed +
                "', passengersOnBoard='" + passengersOnBoard +'\'' +
                '}'+" " + super.toString();
    }
}
