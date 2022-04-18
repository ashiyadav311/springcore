package com.springcore.auto.wire;

public class Student {
    private Address address;
    private CourseDuration Course;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student(Address address) {
        this.address = address;
    }

    public CourseDuration getCourse() {
        return Course;
    }

    public void setCourse(CourseDuration course) {
        this.Course = course;
    }

    public Student(CourseDuration course) {
        this.Course = course;
    }

    public Student(){
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "address=" + address +
                ", Course=" + Course +
                '}';
    }
}
