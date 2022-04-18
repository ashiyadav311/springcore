package com.springcore.auto.wire.annotation;

import com.springcore.auto.wire.annotation.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
    @Autowired
    @Qualifier("address2")

    private Address address;

    public Address getAddress() {

        return address;
    }


    public void setAddress(Address address) {

        this.address = address;
        System.out.println("Inside Setter");
    }

    public Student(Address address) {

        this.address = address;
        System.out.println("Inside Constructor");
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "address=" + address +
                '}';
    }
}

