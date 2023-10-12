package com.akash;

public class ICEV extends Vehicle{

    public ICEV(int id, String model, String color, Manufacture manufacture, CombustionEngine engine) {
        super(id, model, color, manufacture, engine);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("Characteristics of the vehicle:");
        System.out.println("Vehicle type: Internal Combustion Engine Vehicle");
        System.out.println("Engine Type: "+this.getEngine().getType());
        System.out.println("Id: "+ this.getId() + "\nMake: "+this.getManufacture().getMake() + "\nModel: "+this.getModel() + "\nYear of Manufacture: "+this.getManufacture().getYearOfManufacture()+ "\nColor: "+this.getColor()+ "\nPrice: "+this.getManufacture().getPrice() + "\nRegistration Number: "+this.getEngine().getRegistrationNumber()+"\n");

    }
}
