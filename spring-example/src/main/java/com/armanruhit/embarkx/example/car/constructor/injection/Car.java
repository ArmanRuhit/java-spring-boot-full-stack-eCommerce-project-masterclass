package com.armanruhit.embarkx.example.car.constructor.injection;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }



    public void displayCar() {
        System.out.println("Car details: "+ specification);
    }
}
