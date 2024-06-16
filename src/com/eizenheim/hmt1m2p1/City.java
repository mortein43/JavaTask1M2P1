package com.eizenheim.hmt1m2p1;

public class City {
    private String name;
    private String region;
    private String country;
    private int population;
    private String postalCode;
    private String phoneCode;

    public City(String name, String region, String country, int population, String postalCode,
            String phoneCode) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.population = population;
        this.postalCode = postalCode;
        this.phoneCode = phoneCode;
    }

    @Override
    public String toString() {
        return  "Місто - " + name + ";\n" +
                "Область - " + region + ";\n" +
                "Країна - " + country + ";\n" +
                "Населення - " + population + ";\n" +
                "Поштовий індекс - " + postalCode + ";\n" +
                "Телефонний код - " + phoneCode + ";\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }
}
