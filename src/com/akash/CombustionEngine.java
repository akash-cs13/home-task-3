package com.akash;

public class CombustionEngine extends Engine{
    private String type = "Combustion Engine";

    public CombustionEngine(String registrationNumber) {
        super(registrationNumber);
    }

    @Override
    public String getType() {
        return type;
    }
}
