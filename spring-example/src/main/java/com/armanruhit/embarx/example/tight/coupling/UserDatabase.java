package com.armanruhit.embarx.example.tight.coupling;


// A - MySql, Postgres
// B - Web Service, MongoDB
public class UserDatabase {
    public String getUserDetails() {
        // Directly access database here
        return "User Details From Database";
    }
}
