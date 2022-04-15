package com.maks.Classes;

import org.apache.log4j.Logger;

public final class Address {

    private static final Logger LOGGER = Logger.getLogger(Address.class);

    private String country;
    private String city;
    private String region;
    private String street;
    private String postCode;

    public Address() {
    }

    public Address(String country, String city, String region, String street, String postCode) {
        this.country = country;
        this.city = city;
        this.region = region;
        this.street = street;
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", street='" + street + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}
