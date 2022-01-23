package com.company;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;

public class Main {

    public static void main(String[] args) {
        Human student = new Human();
        Human teacher = new Human();
        Human homoSapiens = new Human();
        Pet cat = new Pet("cat");
        Pet dog = new Pet("dog");
        FarmAnimal canis = new FarmAnimal("canis");
        FarmAnimal cow = new FarmAnimal("cow");

        System.out.println("Canis");
        canis.beEaten();
        canis.beEaten();

        System.out.println("Kot");
        cat.feed();
        cat.feed(10.0);

        System.out.println("Krowa" );
        cow.feed(20.0);
        cow.beEaten();
        cow.beEaten();
    }
}
