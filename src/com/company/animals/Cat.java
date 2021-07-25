package com.company.animals;

public class Cat extends Animal{
    private static final  int runDistance = 200;
    public Cat(String name){
        super(name);
    }
    @Override
    public void doSwim(int distance ){
        System.out.printf("%s - is a cat, cats can't swim%n", name);
    }
    @Override
    public void doRun(int distance){
        System.out.printf("%s ran %d meters%n" , name , Math.min(distance,runDistance));
    }


}
