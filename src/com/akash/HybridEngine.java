package com.akash;

public class HybridEngine  extends Engine{
    private String type = "Hybrid Engine";

    public HybridEngine(String registrationNumber) {
        super(registrationNumber);
    }

    @Override
    public String getType() {
        return type;
    }
}
