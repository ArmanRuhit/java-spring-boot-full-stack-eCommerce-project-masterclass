package com.armanruhit.embarx.example.tight.coupling;

public class TightCouplingExample {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        String userDetails = userManager.getUserDetails();
        System.out.println(userDetails);
    }
}
