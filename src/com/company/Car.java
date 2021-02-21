package com.company;

public abstract class Car {
    String model;
    int speed = 0;
    String color;

    public Car() {
    }

    public void gas(int gas) {
        System.out.println("gas: " + gas);
        this.speed = gas + this.speed;
    }

    public void brake(int brake) {
        System.out.println("brake: " + brake);
        this.speed = this.speed - brake;
    }

    public abstract void description();
}