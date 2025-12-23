package com.armanruhit.embarx.example.loose.coupling;

public class WebServiceDataProvider implements UserDataProvider{
    @Override
    public String getUserDetails() {
        return "Fetch UserDetails From WebService";
    }
}
