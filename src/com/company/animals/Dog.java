package com.company.animals;

public class Dog  extends Animal{
    private static final int runDistance = 500;
    private static final int swimDistance = 10;
    public Dog(String name){
        super(name);
    }
    @Override
    public void doRun(int distance){
        System.out.printf("%s  ran  %d meter's%n",name,Math.min(distance,runDistance));
    }
    @Override
    public void doSwim(int distance){
        System.out.printf("%s  swam  %d meter's%n",name,Math.min(distance,swimDistance));
    }
}
