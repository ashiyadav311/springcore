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
        Employee Emp4=(Employee) context.getBean("Emp4");
        System.out.println(Emp4.getName());
        System.out.println(Emp4.getAge());
        System.out.println(Emp4.getNumber());
        System.out.println(Emp4.getAddress());
        Employee Emp5=(Employee) context.getBean("Emp5");
        System.out.println(Emp5.getName());
        System.out.println(Emp5.getAge());
        System.out.println(Emp5.getNumber());
        System.out.println(Emp5.getAddress());
        Employee Emp6=(Employee) context.getBean("Emp6");
        System.out.println(Emp6.getName());
        System.out.println(Emp6.getAge());
        System.out.println(Emp6.getNumber());
        System.out.println(Emp6.getAddress());
    }
}
