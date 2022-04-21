package com.springcore.compilation;
import com.springcore.compilation.PassengerAddress;
import org.springframework.beans.factory.annotation.Autowired;

public class Passenger {
    private String Name;
    private int Age;
    private int PhoneNo;
    private PassengerAddress address;

    public Passenger() {
    }

    public Passenger(String name, int age, int phoneNo, PassengerAddress address) {
        this.Name = name;
        this.Age = age;
        this.PhoneNo = phoneNo;
        this.address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public int getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.PhoneNo = phoneNo;
    }

    public PassengerAddress getAddress() {
        return address;
    }

    public void setAddress(PassengerAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", PhoneNo=" + PhoneNo +
                ", address=" + address +
                '}';
    }
}
