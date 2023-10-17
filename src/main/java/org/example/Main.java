package org.example;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
        Resource r = new ClassPathResource("spring.xml");
        BeanFactory factory = new XmlBeanFactory(r);

        Object o1 = factory.getBean("t");
        Object o2 = factory.getBean("t");
        Object o3 = factory.getBean("t");

        System.out.println(o1==o2);
        System.out.println(o2==o3);


        Test t = (Test)o1;
        t.hello();
    }
}