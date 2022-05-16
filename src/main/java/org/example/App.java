package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("adilet",Person.class);
        System.out.println("adilet: " + person);


        Person person1 = context.getBean("maksat",Person.class);
        System.out.println("\nmaksat: " + person1);
        context.close();
    }
}
