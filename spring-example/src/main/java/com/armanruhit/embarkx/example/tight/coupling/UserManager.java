package com.armanruhit.embarkx.example.tight.coupling;

public class UserManager {
    private final UserDatabase userDatabase = new UserDatabase();


    public String getUserDetails() {
        return userDatabase.getUserDetails();
    }
}
