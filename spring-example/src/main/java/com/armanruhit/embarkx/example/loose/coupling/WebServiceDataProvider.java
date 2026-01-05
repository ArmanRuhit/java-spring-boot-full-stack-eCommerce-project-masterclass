package com.armanruhit.embarkx.example.loose.coupling;

public class WebServiceDataProvider implements UserDataProvider{
    @Override
    public String getUserDetails() {
        return "Fetch UserDetails From WebService";
    }
}
