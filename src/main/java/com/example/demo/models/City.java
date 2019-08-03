package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {

    @Id
    String name;
    String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
