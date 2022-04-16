package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("EmpConfig.xml");
        Employee Emp1=(Employee) context.getBean("Emp1");
        System.out.println(Emp1.getName());
        System.out.println(Emp1.getAge());
        System.out.println(Emp1.getNumber());
        System.out.println(Emp1.getAddress());
        Employee Emp2=(Employee) context.getBean("Emp2");
        System.out.println(Emp2.getName());
        System.out.println(Emp2.getAge());
        System.out.println(Emp2.getNumber());
        System.out.println(Emp2.getAddress());
        Employee Emp3=(Employee) context.getBean("Emp3");
        System.out.println(Emp3.getName());
        System.out.println(Emp3.getAge());
        System.out.println(Emp3.getNumber());
        System.out.println(Emp3.getAddress());
    }
}
