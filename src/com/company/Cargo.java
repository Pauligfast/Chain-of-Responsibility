package com.company;

public class Cargo {
    private Country country;
    private double weight;

    public Cargo(Country country, double weight) {
        this.country = country;
        this.weight = weight;
    }

    public Country getCountry() {
        return country;
    }

    public double getWeight() {
        return weight;

    }


}
