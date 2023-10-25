package org.example;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {

        try {
            Class c = Class.forName("org.example.beans.Test");
            Constructor constructor[]=c.getDeclaredConstructors();
            constructor[0].setAccessible(true);
            constructor[0].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}