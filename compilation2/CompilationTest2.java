package com.springcore.compilation2;
import com.springcore.compilation.Passenger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class CompilationTest2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("CompilationConfig2.xml");
        CollegeStudents S1 = (CollegeStudents) context.getBean("S1");
        System.out.println(S1.getName());
        System.out.println(S1.getAge());
        System.out.println(S1.getShift());
        System.out.println(S1.getAd().getClass());
        System.out.println(S1);
        CollegeStudents S2 = (CollegeStudents) context.getBean("S2");
        System.out.println(S2.getName());
        System.out.println(S2.getAge());
        System.out.println(S2.getShift());
        System.out.println(S2.getAd().getClass());
        System.out.println(S2);
        College C1 = (College) context.getBean("C1");
        System.out.println(C1.getCS().getClass());
        System.out.println(C1);
        College C2 = (College) context.getBean("C2");
        System.out.println(C2.getCS().getClass());
        System.out.println(C2);
        College C3 = (College) context.getBean("C3");
        System.out.println(C3.getCS().getClass());
        System.out.println(C3);
    }
}
