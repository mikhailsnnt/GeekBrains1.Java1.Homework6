package com.company;

import com.company.animals.*;

public class Main {

    public static void main(String[] args) {
        Animal[] animals ={
                new Cat("Matroskin"),
                new Dog("Sharik"),
                new Cat("Puh")
        };
        int dogsCount = 0 , catsCount = 0;
        for (Animal animal : animals)
        {
            if (animal instanceof Cat)
                catsCount++;
            else
                dogsCount++;
        }
        animals[0].doRun(100);
        animals[1].doSwim(500);
        animals[2].doSwim(100);
        System.out.printf("Animals : %d%n" +
                "Dogs: %d%n" +
                "Cats: %d%n", animals.length,dogsCount,catsCount);
    }
}
