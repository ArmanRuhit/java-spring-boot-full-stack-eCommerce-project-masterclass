package com.armanruhit.embarx.example.car.setter.injection;

public class Car {
    private Specification specification;


    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayCar() {
        System.out.println("Car details: "+ specification);
    }
}
