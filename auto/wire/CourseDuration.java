package com.springcore.auto.wire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import org.springframework.stereotype.Component;
@Component
public class CourseDuration {

@Value("Mathematics")
    private String Course;
@Value("3")
    private int Duration;

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    @Override
    public String toString() {
        return "CourseDuration{" +
                "Course='" + Course + '\'' +
                ", Duration=" + Duration +
                '}';
    }
}
