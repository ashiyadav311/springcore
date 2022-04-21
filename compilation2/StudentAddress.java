package com.springcore.compilation2;

public class StudentAddress {
    public double StreetNo;
    public String City;
    public float PinCode;

    public double getStreetNo() {
        return StreetNo;
    }

    public void setStreetNo(double streetNo) {
        StreetNo = streetNo;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public float getPinCode() {
        return PinCode;
    }

    public void setPinCode(float pinCode) {
        PinCode = pinCode;
    }

    public StudentAddress(double streetNo, String city, float pinCode) {
        StreetNo = streetNo;
        City = city;
        PinCode = pinCode;
    }

    public StudentAddress(){
        super();
    }

    @Override
    public String toString() {
        return "StudentAddress{" +
                "StreetNo=" + StreetNo +
                ", City='" + City + '\'' +
                ", PinCode=" + PinCode +
                '}';
    }
}