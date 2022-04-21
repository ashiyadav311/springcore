package com.springcore.compilation2;

import com.springcore.compilation.PassengerAddress;

public class CollegeStudents {
    public String Name;
    public int Age;
    public String Shift;
    public StudentAddress Ad;

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

    public String getShift() {
        return Shift;
    }

    public void setShift(String shift) {
        Shift = shift;
    }

    public StudentAddress getAd() {
        return Ad;
    }

    public void setAd(StudentAddress ad) {
        Ad = ad;
    }

    public CollegeStudents(String name, int age, String shift, StudentAddress ad) {
        Name = name;
        Age = age;
        Shift = shift;
        Ad = ad;
    }

    public CollegeStudents(){
        super();
    }

    @Override
    public String toString() {
        return "CollegeStudents{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Shift='" + Shift + '\'' +
                ", Ad=" + Ad +
                '}';
    }
}
