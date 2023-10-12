package com.akash;

public class Main {
    public static void main(String[] args) {
    ICEV vehicle1 = new ICEV(1, "Indica","Silve",new Manufacture("Tata", 2020, 12000), new CombustionEngine("AB13FE42"));
    BEV vehicle2 = new BEV(2, "Model 3", "Black", new Manufacture("Tesla", 2023, 65000), new ElectricEngine("US02AS86"));
    HybridV vehicle3 = new HybridV(3, "Camry", "White", new Manufacture("Toyota", 2022, 55000), new HybridEngine("JP12TX42"));

    vehicle1.ShowCharacteristics();
    vehicle2.ShowCharacteristics();
    vehicle3.ShowCharacteristics();

    }
}