package com.akash;

public abstract class Vehicle {

    private int id;
    private String model;
    private String color;
    private Manufacture manufacture;
    private Engine engine;

    public Vehicle(int id, String model, String color, Manufacture manufacture, Engine engine) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.manufacture = manufacture;
        this.engine = engine;
    }


    public abstract void ShowCharacteristics();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

    public void setManufacture(Manufacture manufacture) {
        this.manufacture = manufacture;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
