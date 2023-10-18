package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
        Resource r = new ClassPathResource("spring.xml");

        BeanFactory factory = new XmlBeanFactory(r);

        factory.getBean("t");
    }
}