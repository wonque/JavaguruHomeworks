package homework9.Car;

public enum BodyTypes {

    COUPE(1), HATCHBACK(3), SUV(4), VAN(6);

    private int passengersCount;

    BodyTypes (int passengersCount){
        this.passengersCount = passengersCount;
    }

    public int getPassengersCount(){
        return this.passengersCount;
    }
}
