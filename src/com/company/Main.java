package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Human student = new Human("Dawid", "Grabowicz", 25);
        Human teacher = new Human("Zbigniew", "Boniek", 25);
        Car opel = new Car("Opel", "Astra", 1999, "Silver");
        Car volvo = new Car("Volvo", "XC60", 2020, "Black");
        Phone iphone = new Phone("Apple", "iphone", 2019, 5.3, 8);
        Phone samsung = new Phone("Samsung", "Galaxy", 2019, 6.0, 6);
        Animal cat = new Animal("cat");
        Animal dog = new Animal("dog");
        System.out.println(opel);
        System.out.println(volvo);
        System.out.println("------------------------------------------");
        System.out.println(student);
        System.out.println(teacher);
        System.out.println("------------------------------------------");
        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println("------------------------------------------");
        System.out.println(cat);
        System.out.println(dog);
        System.out.println("------------------------------------------");
        iphone.turnOn();
        System.out.println("------------------------------------------");
        samsung.turnOn();
        System.out.println("------------------------------------------");
        opel.turnOn();
        System.out.println("------------------------------------------");
        volvo.turnOn();


    }
}
