package com.armanruhit.embarx.example.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider userDataProvider = new UserDatabase();
        UserManager userManager = new UserManager(userDataProvider);
        String userDetails = userManager.getUserDetails();
        System.out.println(userDetails);


        UserDataProvider userDataProviderWebService = new WebServiceDataProvider();
        UserManager userManagerWebService = new UserManager(userDataProviderWebService);
        String userDetailsWebService = userManagerWebService.getUserDetails();
        System.out.println(userDetailsWebService);
    }
}
