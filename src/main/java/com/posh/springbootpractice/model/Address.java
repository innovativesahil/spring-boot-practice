package com.posh.springbootpractice.model;

public class Address {

    private String addressStreet;
    private String addressCity;
    private String addressCountry;
    private Integer addressPinCode;

    public Address(String addressStreet, String addressCity, String addressCountry, Integer addressPinCode) {
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
        this.addressPinCode = addressPinCode;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public Integer getAddressPinCode() {
        return addressPinCode;
    }

    public void setAddressPinCode(Integer addressPinCode) {
        this.addressPinCode = addressPinCode;
    }
}
