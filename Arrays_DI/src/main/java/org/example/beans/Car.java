package org.example.beans;

public class Car {

    private String[] carName;

    private Engine[] engine;

    public void setCarName(String[] carName){
        this.carName = carName;
    }

    public void setEngine(Engine[] engine){
        this.engine = engine;
    }

    public void printCarData(){
        for (String car: carName){
            System.out.println(car);
        }
        for (Engine engine: engine){
            System.out.println(engine.getModelYear());
        }
    }
}
