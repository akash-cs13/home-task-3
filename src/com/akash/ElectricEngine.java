package com.akash;

public class ElectricEngine extends Engine{
    private String type = "Electric Engine";

    public ElectricEngine(String registrationNumber) {
        super(registrationNumber);
    }

    @Override
    public String getType() {
        return type;
    }
}
