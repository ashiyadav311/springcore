package com.springcore.auto.wire;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestStereo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("StereoConfig.xml");
        com.springcore.auto.wire.CourseDuration courseDuration = context.getBean("courseDuration", com.springcore.auto.wire.CourseDuration.class);
        System.out.println(courseDuration);
    }

}
