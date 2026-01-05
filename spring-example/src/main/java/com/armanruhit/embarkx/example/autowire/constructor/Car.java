package com.armanruhit.embarkx.example.autowire.constructor;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }


    public void setSpecification(Specification specification) {
        this.specification = specification;
    }


    public void displayCar() {
        System.out.println("Car details: "+ specification);
    }
}
