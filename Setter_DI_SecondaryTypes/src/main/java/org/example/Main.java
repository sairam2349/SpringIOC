package org.example;

import org.example.beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
/*
        String files[] = new String[]{"car.xml","engine.xml"};
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(files);
*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("car-engine.xml");

        Car car = (Car) applicationContext.getBean("c");
        car.printCarData();
    }
}