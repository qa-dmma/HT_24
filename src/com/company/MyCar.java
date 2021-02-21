package com.company;

public class MyCar extends Car {


    public MyCar() {
    }

    public MyCar(String model, int speed, String color) {
        this.model = (("Model of this car: "+model) + (", speed: "+speed) + (", and color of this car is "+color));
        this.speed = speed;
        this.color = color;
    }

    public void description() {
        System.out.println(this.model);
    }


}

