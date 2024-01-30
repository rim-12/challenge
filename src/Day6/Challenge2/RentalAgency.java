package Day6.Challenge2;

import Day6.Challenge2.Vehicule;

import java.util.ArrayList;

public class RentalAgency {
    public ArrayList<Vehicule> fleet = new ArrayList<>();

    public void addVehicle(Vehicule vehicle) {
        fleet.add(vehicle);
    }

    public void displayavail() {
        for (Vehicule vehicle : fleet) {
            System.out.println(vehicle.getMake());
            System.out.println(vehicle.getRent());
            System.out.println(vehicle.getRentalPrice());
            System.out.println("*****************************************");
        }
    }

    public void rentVehicle(Vehicule vehicle) {
        if (!vehicle.getRent()) {
            vehicle.setRent(true);
        } else {
            System.out.println("le vehicule est déja loué");
        }

    }
}
