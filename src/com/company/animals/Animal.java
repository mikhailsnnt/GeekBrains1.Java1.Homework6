package com.company.animals;

public abstract class Animal {
    protected String name;
    public Animal(String name){
        this.name = name;
    }
    public abstract void doRun(int distance);
    public abstract void doSwim(int distance);
    public String getName(){
        return name;
    }

}
