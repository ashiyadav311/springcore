package com.springcore.auto.wire.annotation;
import com.springcore.auto.wire.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWireAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AutowireConfigAnnotation.xml");
        com.springcore.auto.wire.annotation.Student Student1 = context.getBean("Student1", com.springcore.auto.wire.annotation.Student.class);
        System.out.println(Student1);
    }
    }
