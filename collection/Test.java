package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("EmpConfig.xml");
        Employee Emp1=(Employee) context.getBean("employee1");
        System.out.println(Emp1.getEmpId());
        System.out.println(Emp1.getEmpName());
        System.out.println(Emp1.getNumber());
        System.out.println(Emp1.getAddress());
        Employee Emp2=(Employee) context.getBean("employee2");
        System.out.println(Emp2.getEmpId());
        System.out.println(Emp2.getEmpName());
        System.out.println(Emp2.getNumber());
        System.out.println(Emp2.getAddress());
        Employee Emp3=(Employee) context.getBean("employee3");
        System.out.println(Emp3.getEmpId());
        System.out.println(Emp3.getEmpName());
        System.out.println(Emp3.getNumber());
        System.out.println(Emp3.getAddress());
        Employee Emp4=(Employee) context.getBean("employee4");
        System.out.println(Emp4.getEmpId());
        System.out.println(Emp4.getEmpName());
        System.out.println(Emp4.getNumber());
        System.out.println(Emp4.getAddress());
        Employee Emp5=(Employee) context.getBean("employee5");
        System.out.println(Emp5.getEmpId());
        System.out.println(Emp5.getEmpName());
        System.out.println(Emp5.getNumber());
        System.out.println(Emp5.getAddress());
        Employee Emp6=(Employee) context.getBean("employee6");
        System.out.println(Emp6.getEmpId());
        System.out.println(Emp6.getEmpName());
        System.out.println(Emp6.getNumber());
        System.out.println(Emp6.getAddress());
    }
}
