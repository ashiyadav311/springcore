package com.springcore.compilation;
import com.springcore.compilation.PassengerAddress;
import org.springframework.beans.factory.annotation.Autowired;

public class Passenger {
    private String Name;
    private int Age;
    private int PhoneNo;
    private PassengerAddress A;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public double getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        PhoneNo = phoneNo;
    }

    public PassengerAddress getA() {
        return A;
    }

    public void setA(PassengerAddress a) {
        A = a;
    }

    public Passenger(String name, int age, int phoneNo, PassengerAddress a) {
        Name = name;
        Age = age;
        PhoneNo = phoneNo;
        A = a;
    }
    public Passenger() {
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", PhoneNo=" + PhoneNo +
                ", A=" + A +
                '}';
    }
}
