package com.eizenheim.hmt1m2p1;

public class Human {
    private String lastName;
    private String firstName;
    private String secondName;
    private String birthday;
    private String phoneNumber;
    private String city;
    private String country;
    private String address;

    public Human(String lastName, String firstName, String secondName, String birthday,
            String phoneNumber, String city, String country, String address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.country = country;
        this.address = address;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday (String birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return  "Прізвище Ім’я По батькові - " + lastName + ' ' + firstName + ' ' + secondName + ";\n" +
                "День народження - " + birthday + ";\n" +
                "Номер телефону - " + phoneNumber + ";\n" +
                "Місто - " + city + ";\n" +
                "Країна - " + country + ";\n" +
                "Адреса - " + address + ";\n";
    }
}
