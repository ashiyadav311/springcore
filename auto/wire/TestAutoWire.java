package com.springcore.auto.wire;
import com.springcore.ref.Reference1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestAutoWire {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AutowireConfig.xml");
        Student Student1 = context.getBean("Student1", Student.class);
        System.out.println(Student1);
        Student Student2 = context.getBean("Student2", Student.class);
        System.out.println(Student2);
    }
    }
