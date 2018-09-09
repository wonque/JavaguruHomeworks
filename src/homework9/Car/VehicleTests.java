package homework9.Car;

public class VehicleTests {

    public static void main(String[] args) {

        Truck volvoTruck = new Truck("Volvo", 500, 150, Engines.DIESEL, 6000);
        System.out.println(volvoTruck);
        volvoTruck.loadTruck();
        volvoTruck.accelerateToAllowedSpeed();
        volvoTruck.slowDown();
        volvoTruck.unloadTruck();
        System.out.println(volvoTruck);
        System.out.println();

        Truck scaniaTruck = new Truck("Scania", 500, 150, Engines.DIESEL, 5400.500);
        System.out.println(scaniaTruck);
        scaniaTruck.loadTruck();
        scaniaTruck.accelerateToAllowedSpeed();
        scaniaTruck.accelerateToMaxSpeed();
        System.out.println(scaniaTruck);
        System.out.println();


        PassengersCar coupe = new PassengersCar("Audi", 300, 250, Engines.GASOLINE, BodyTypes.COUPE);
        System.out.println(coupe);
        coupe.pickUpPassengers();
        coupe.accelerateToAllowedSpeed();
        coupe.dropPassengers();
        System.out.println(coupe);
        coupe.slowDown();
        coupe.dropPassengers();


        PassengersCar prius = new PassengersCar("Toyota", 100, 180, Engines.HYBRID, BodyTypes.HATCHBACK);
        prius.pickUpPassengers();
        prius.accelerateToAllowedSpeed();
        System.out.println(prius);
        prius.dropPassengers();
        System.out.println(prius.getPassengersOnBoard());
        prius.slowDown();
        prius.dropPassengers();
        System.out.println(prius);


        Bus skoda = new Bus("Skoda", 400, 150,Engines.DIESEL, 42);
        skoda.pickUpPassengers();
        skoda.accelerateToAllowedSpeed();
        skoda.dropPassengers();
        System.out.println("Passengers in bus: "+ skoda.getPassengersInBus());
        skoda.slowDown();
        skoda.dropPassengers();
        System.out.println("Passengers in bus: "+ skoda.getPassengersInBus());


    }
}

