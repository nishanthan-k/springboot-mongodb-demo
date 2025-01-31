package com.nishanthan.mongodemo.springboot_mongodb_demo.models;

import lombok.Data;

@Data
public class Address {
    private String country;
    private String city;
    private String postalCode;

    public Address(String country, String city, String postalCode) {
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
    }

}
