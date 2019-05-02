package com.bonsoirzw.chapter2;

public abstract class Beverage {
    String description = "UnKnown Beverage";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
