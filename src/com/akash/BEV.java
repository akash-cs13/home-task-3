package com.akash;

public class BEV extends Vehicle{

    public BEV(int id, String model, String color, Manufacture manufacture, ElectricEngine engine) {
        super(id, model, color, manufacture, engine);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("Characteristics of the vehicle:");
        System.out.println("Vehicle type: Battery Electric Vehicle");
        System.out.println("Engine Type: "+this.getEngine().getType());
        System.out.println("Id: "+ this.getId() + "\nMake: "+this.getManufacture().getMake() + "\nModel: "+this.getModel() + "\nYear of Manufacture: "+this.getManufacture().getYearOfManufacture()+ "\nColor: "+this.getColor()+ "\nPrice: "+this.getManufacture().getPrice() + "\nRegistration Number: "+this.getEngine().getRegistrationNumber()+"\n");

    }
}
