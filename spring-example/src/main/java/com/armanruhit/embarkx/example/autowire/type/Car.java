package com.armanruhit.embarkx.example.autowire.type;

public class Car {
    private Specification specification;

//    constructor is not needed as this will autowired by setter
//    public Car(Specification specification) {
//        this.specification = specification;
//    }


    public void setSpecification(Specification specification) {
        this.specification = specification;
    }


    public void displayCar() {
        System.out.println("Car details: "+ specification);
    }
}
