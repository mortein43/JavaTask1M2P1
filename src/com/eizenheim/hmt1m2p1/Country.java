package com.eizenheim.hmt1m2p1;

import java.util.Arrays;

public class Country {
    private String country;
    private String continent;
    private int population;
    private String phoneCode;
    private String capital;
    private String[] cities;

    public Country(String country, String continent, int population, String phoneCode,
            String capital,
            String[] cities) {
        this.country = country;
        this.continent = continent;
        this.population = population;
        this.phoneCode = phoneCode;
        this.capital = capital;
        this.cities = cities;
    }

    @Override
    public String toString() {
        return  "Країна - " + country + '\n' +
                "Континент - " + continent + '\n' +
                "Населення - " + population + '\n' +
                "Телефонний код - " + phoneCode + '\n' +
                "Столиця - " + capital + '\n' +
                "Міста: " + Arrays.toString(cities) + '\n';
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String[] getCities() {
        return cities;
    }

    public void setCities(String[] cities) {
        this.cities = cities;
    }
}
