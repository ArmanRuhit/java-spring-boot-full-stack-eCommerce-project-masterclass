package com.armanruhit.embarx.example.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main(String[] args) {
//        UserDataProvider userDataProvider = new UserDatabase();
//        UserManager userManager = new UserManager(userDataProvider);
//        String userDetails = userManager.getUserDetails();
//        System.out.println(userDetails);
//
//
//        UserDataProvider userDataProviderWebService = new WebServiceDataProvider();
//        UserManager userManagerWebService = new UserManager(userDataProviderWebService);
//        String userDetailsWebService = userManagerWebService.getUserDetails();
//        System.out.println(userDetailsWebService);


        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        UserManager userManager = (UserManager) context.getBean("userManagerUserDatabaseBean");

        System.out.println(userManager.getUserDetails());

        UserManager userManagerWebServiceProvider = (UserManager) context.getBean("userManagerWebServiceDataProviderBean");

        System.out.println(userManagerWebServiceProvider.getUserDetails());
    }
}
