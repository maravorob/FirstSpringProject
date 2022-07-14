package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloWorldRunner {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringHelloWorld springHelloWorld = context.getBean("springHelloWorldBean", SpringHelloWorld.class);
        springHelloWorld.outputMessage();

        context.close();


    }
}
