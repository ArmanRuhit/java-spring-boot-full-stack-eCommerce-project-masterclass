package com.armanruhit.embarkx.example.autowire.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        Car car = (Car) context.getBean("carBeanAutowireByType");

        car.displayCar();
    }
}
