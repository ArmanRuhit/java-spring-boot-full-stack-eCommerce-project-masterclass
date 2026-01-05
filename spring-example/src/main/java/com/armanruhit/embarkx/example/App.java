package com.armanruhit.embarkx.example;

import com.armanruhit.embarkx.example.car.bean.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        MyBean myBean = (MyBean) context.getBean("myBean");

        System.out.println(myBean);
    }


}
