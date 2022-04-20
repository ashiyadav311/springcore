package com.springcore.compilation;

public class PassengerAddress {
    private int StreetNo;
    private int PinCode;
    private String City;
    private String Landmark;

    public int getStreetNo() {
        return StreetNo;
    }

    public void setStreetNo(int streetNo) {
        StreetNo = streetNo;
    }

    public int getPinCode() {
        return PinCode;
    }

    public void setPinCode(int pinCode) {
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


    public PassengerAddress(int streetNo, int pinCode, String city, String landmark) {
        StreetNo = streetNo;
        PinCode = pinCode;
        City = city;
        Landmark = landmark;
    }
    public PassengerAddress() {
        super();
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

