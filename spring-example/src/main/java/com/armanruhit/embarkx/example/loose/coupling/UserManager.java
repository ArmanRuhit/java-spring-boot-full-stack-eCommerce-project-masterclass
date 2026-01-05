package com.armanruhit.embarkx.example.loose.coupling;

public class UserManager {
    private final UserDataProvider userDatabase;

    UserManager(UserDataProvider userDataProvider){
        this.userDatabase = userDataProvider;
    }


    public String getUserDetails() {
        return userDatabase.getUserDetails();
    }
}
