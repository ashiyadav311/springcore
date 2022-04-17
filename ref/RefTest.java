package com.springcore.ref;
import com.springcore.ref.Reference1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class RefTest {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("RefConfig.xml");
        Reference1 Temp=(Reference1) context.getBean("Ref1");
        System.out.println(Temp.getX());
        System.out.println(Temp.getOb().getY());
        System.out.println(Temp);
        Reference1 Temp2=(Reference1) context.getBean("Ref11");
        System.out.println(Temp2.getX());
        System.out.println(Temp2.getOb().getY());
        System.out.println(Temp2);
        Reference1 Temp3=(Reference1) context.getBean("Ref12");
        System.out.println(Temp3.getX());
        System.out.println(Temp3.getOb().getY());
        System.out.println(Temp3);
    }
}
