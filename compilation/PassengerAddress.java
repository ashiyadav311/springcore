package com.springcore.compilation;

import org.springframework.beans.factory.annotation.Autowired;

public class PassengerAddress {
    private double StreetNo;
    private float PinCode;
    private String City;
    private String Landmark;

    public double getStreetNo() {
        return StreetNo;
    }

    public void setStreetNo(double streetNo) {
        StreetNo = streetNo;
    }

    public float getPinCode() {
        return PinCode;
    }

    public void setPinCode(float pinCode) {
        PinCode = pinCode;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getLandmark() {
        return Landmark;
    }

    public void setLandmark(String landmark) {
        Landmark = landmark;
    }


    public PassengerAddress(double streetNo, float pinCode, String city, String landmark) {
        this.StreetNo = streetNo;
        this.PinCode = pinCode;
        this.City = city;
        this.Landmark = landmark;
    }
    public PassengerAddress() {
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

