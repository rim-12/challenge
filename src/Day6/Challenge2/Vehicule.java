package Day6.Challenge2;

public class Vehicule {
    private String make;
    private String model;
    private int rentalPrice;
    private boolean rent;

    public Vehicule(String make, String model, int rentalPrice) {
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
        this.rent = false;
    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getRentalPrice() {
        return rentalPrice;
    }
    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }



    public Vehicule(boolean rent) {
        this.rent = rent;
    }

    public boolean getRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    public void displayavail(){
        System.out.println("make:"+make+",model:"+make+",retal price:"+rentalPrice);
    }

}

