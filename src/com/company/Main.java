package com.company;

public class Main {

    public static void main(String[] args) {
        Human student = new Human("Dawid", "Grabowicz", 25);
        Human teacher = new Human("Zbigniew", "Boniek", 25);
        Animal dog2 = new Animal("dog");
        Animal dog = new Animal("dog");
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();
        System.out.println("----------------------------------------------");
        Animal cat = new Animal("cat");
        cat.feed();
        cat.feed();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        System.out.println("----------------------------------------------");
        student.setPet(dog);
        System.out.println(student.getPet().species);
        student.pet.feed();
        student.pet.takeForAWalk();
        System.out.println("----------------------------------------------");
        teacher.setPet(dog2);
        System.out.println(teacher.getPet().species);
        teacher.pet.feed();
        teacher.pet.takeForAWalk();

    }
}
