package com.springcore.compilation;

import org.springframework.beans.factory.annotation.Autowired;

public class PassengerAddress {
    private int StreetNo;
    private int PinCode;
    private String City;
    private String Landmark;

    public PassengerAddress() {
    }

    public PassengerAddress(int streetNo, int pinCode, String city, String landmark) {
        this.StreetNo = streetNo;
        this.PinCode = pinCode;
        this.City = city;
        this.Landmark = landmark;
    }

    public double getStreetNo() {

        return StreetNo;
    }

    public void setStreetNo(int streetNo) {
        this.StreetNo = streetNo;
    }

    public float getPinCode() {

        return PinCode;
    }

    public void setPinCode(int pinCode) {

        this.PinCode = pinCode;
    }

    public String getCity() {

        return City;
    }

    public void setCity(String city) {
        this.City = city;
    }

    public String getLandmark() {
        return Landmark;
    }

    public void setLandmark(String landmark) {

        this.Landmark = landmark;
    }


    @Override
    public String toString() {
        return "PassengerAddress{" +
                "StreetNo=" + StreetNo +
                ", PinCode=" + PinCode +
                ", City='" + City + '\'' +
                ", Landmark='" + Landmark + '\'' +
                '}';
    }
}

