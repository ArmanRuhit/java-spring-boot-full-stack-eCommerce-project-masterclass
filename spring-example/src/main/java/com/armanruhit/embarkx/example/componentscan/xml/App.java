package com.armanruhit.embarkx.example.componentscan.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        Employee employee = context.getBean("employee", Employee.class);

        System.out.println(employee);
    }
}
