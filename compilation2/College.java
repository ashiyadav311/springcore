package com.springcore.compilation2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class College {
    @Autowired
    public List<CollegeStudents> CS;

    public List<CollegeStudents> getCS() {
        return CS;
    }

    public void setCS(List<CollegeStudents> CS) {
        this.CS = CS;
    }

    public College(List<CollegeStudents> CS) {
        this.CS = CS;
    }

    public College(){
        super();
    }

    @Override
    public String toString() {
        return "College{" +
                "CS=" + CS +
                '}';
    }
}
