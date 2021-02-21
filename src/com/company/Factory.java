package com.company;

public class Factory {

    public static void main(String[] args) {

        Car aCar = new MyCar("Tesla",95, "black");
        aCar.gas(15);
        aCar.brake(15);
        aCar.description();

        CarInterface hc = new HisCar("VAZ", 15, "white");

        hc.gas(100);
        hc.brake(100);
        hc.description();
    }
}

