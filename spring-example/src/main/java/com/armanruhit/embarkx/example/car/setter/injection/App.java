package com.armanruhit.embarkx.example.car.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        Car car = (Car) context.getBean("carBeanSetter");

        car.displayCar();
    }
}
