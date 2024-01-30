package Day6.Challenge2;

import Day6.Challenge2.Vehicule;

public class Vehiclemain {
    public static void main(String[] arg) {
        Vehicule car = new Car("rim", "toyota", 1122);
        Vehicule bike = new Bike("rim2", "ford", 4476);
        RentalAgency rentalAgency = new RentalAgency();
        rentalAgency.addVehicle(car);
        rentalAgency.addVehicle(bike);
        rentalAgency.rentVehicle(car);
        rentalAgency.displayavail();
    }
}
