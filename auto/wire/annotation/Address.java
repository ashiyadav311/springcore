package com.springcore.auto.wire.annotation;

public class Address {
    private String Street;
    private int PinCode;

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public int getPinCode() {
        return PinCode;
    }

    public void setPinCode(int pinCode) {
        PinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Street='" + Street + '\'' +
                ", PinCode=" + PinCode +
                '}';
    }
}
