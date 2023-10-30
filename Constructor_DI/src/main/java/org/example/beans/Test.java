package org.example.beans;

public class Test {

    private String name;
    private int age;
    private String email;

    public Test(){
        System.out.println("Test   name, age, email constructor");
    }

    public Test(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void printData(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Email: "+email);

    }
}
