package com.spring.example1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext
                ("ApplicationContext.xml");

        Object movieDAO = ctx.getBean("MovieDAO");

//        System.out.println(actorsDAO.toString());

//        Environment environment = ctx.getEnvironment();
//        System.out.println("Property property.c = " + environment.getProperty("property.c"));
//        System.out.println("Property property.d = " + environment.getProperty("property.d"));

    }
}
