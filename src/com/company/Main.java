package com.company;

public class Main {

    public static void main(String[] args) {
        Human student = new Human("Dawid", "Grabowicz", 25);
        Human teacher = new Human("Zbigniew", "Boniek", 25);
        Car opel = new Car("Astra", "Opel", "Red", 1999);
        Car volvo = new Car("XC60", "Volvo", "Black", 2019);
        student.car = opel;
        teacher.car = volvo;

        System.out.println("Imie: " + student.firstName);
        System.out.println("Nazwisko: " + student.lastName);
        System.out.println("Wiek: " + student.age);
        System.out.println("Model smaochodu: " + student.car.model);
        System.out.println("Producent smaochodu: " + student.car.producer);
        System.out.println("Kolor smaochodu: " + student.car.colour);
        System.out.println("Rok produkcji smaochodu: " + student.car.yearOfProduction);
        System.out.println("-------------------------------------------------------");
        System.out.println("Imie: " + teacher.firstName);
        System.out.println("Nazwisko: " + teacher.lastName);
        System.out.println("Wiek: " + teacher.age);
        System.out.println("Model smaochodu: " + teacher.car.model);
        System.out.println("Producent smaochodu: " + teacher.car.producer);
        System.out.println("Kolor smaochodu: " + teacher.car.colour);
        System.out.println("Rok produkcji smaochodu: " + teacher.car.yearOfProduction);

    }
}
