package com.company;

public class Main {

    public static void main(String[] args) {

        Human student = new Human("Dawid", "Grabowicz", 25);
        Human teacher = new Human("Zbigniew", "Boniek", 70);
        System.out.println("Imie: " + student.firstName);
        System.out.println("Nazwisko: " + student.lastName);
        System.out.println("Wiek: " + student.age + " lat");
        System.out.println("--------------------------------------------------------");
        System.out.println("Imie: " + teacher.firstName);
        System.out.println("Nazwisko: " + teacher.lastName);
        System.out.println("Wiek: " + teacher.age + " lat");
        System.out.println("--------------------------------------------------------");
        Animal dog = new Animal("dog", 7.0);
        Animal cat = new Animal("cat", 4.0);
        System.out.println("Gatuenk: " + dog.species);
        System.out.println("Waga: " + dog.weight + "kg");
        System.out.println("--------------------------------------------------------");
        System.out.println("Gatuenk: " + cat.species);
        System.out.println("Waga: " + cat.weight + "kg");
        System.out.println("--------------------------------------------------------");
        Phone iphone = new Phone("iphone",5.3, "ios", "black", 8);
        Phone samsung = new Phone("samsung",6.0, "Android", "white", 8);
        System.out.println("Model: " + iphone.model);
        System.out.println("Ekran: " + iphone.screenSize);
        System.out.println("System: " + iphone.os);
        System.out.println("Kolor: " + iphone.colour);
        System.out.println("Ram: " + iphone.ramSize + "GB");
        System.out.println("--------------------------------------------------------");
        System.out.println("Model: " + samsung.model);
        System.out.println("Ekran: " + samsung.screenSize);
        System.out.println("System: " + samsung.os);
        System.out.println("Kolor: " + samsung.colour);
        System.out.println("Ram: " + samsung.ramSize + "GB");
        System.out.println("--------------------------------------------------------");
    }
}
