package com.armanruhit.embarx.example.loose.coupling;


// A - MySql, Postgres
// B - Web Service, MongoDB
public class UserDatabase implements UserDataProvider{
    public String getUserDetails() {
        // Directly access database here
        return "User Details From Database";
    }
}
