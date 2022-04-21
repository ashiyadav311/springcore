package com.springcore.compilation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompilationTest {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("CompilationConfig.xml");
        Passenger P1=(Passenger) context.getBean("P1");
        System.out.println(P1.getName());
        System.out.println(P1.getAge());
        System.out.println(P1.getPhoneNo());
        System.out.println(P1.getAddress());
        Passenger P2=(Passenger) context.getBean("P2");
        System.out.println(P2.getName());
        System.out.println(P2.getAge());
        System.out.println(P2.getPhoneNo());
        System.out.println(P2.getAddress());
        Passenger P3=(Passenger) context.getBean("P3");
        System.out.println(P3.getName());
        System.out.println(P3.getAge());
        System.out.println(P3.getPhoneNo());
        System.out.println(P3.getAddress());
        Passenger P4=(Passenger) context.getBean("P4");
        System.out.println(P4.getName());
        System.out.println(P4.getAge());
        System.out.println(P4.getPhoneNo());
        System.out.println(P4.getAddress());
        Passenger P5=(Passenger) context.getBean("P5");
        System.out.println(P5.getName());
        System.out.println(P5.getAge());
        System.out.println(P5.getPhoneNo());
        System.out.println(P5.getAddress());
        Train T1=(Train) context.getBean("T1");
        System.out.println(T1.getTrainName());
        System.out.println(T1.getPNRnumber());
        System.out.println(T1.getArrivalTime());
        System.out.println(T1.getDepartureTime());
        System.out.println(T1.getBoardingStn());
        System.out.println(T1.getDestination());
        System.out.println("List Of Passenger Boarding This Train");
        System.out.println(T1.getP());
    }
}
