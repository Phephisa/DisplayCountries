package com.example.displayprofiles;

public class Country {
    String countryName;
    int countryImage;

    public String getCountryName() {
        return countryName;
    }

    public int getCountryImage() {
        return countryImage;
    }


    public Country(String countryName, int countryImage){
        this.countryName = countryName;
        this.countryImage = countryImage;

    }
}
