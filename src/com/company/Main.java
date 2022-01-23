package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Human student = new Human("Dawid", "Grabowicz", 25);
        Human teacher = new Human("Zbigniew", "Boniek", 25);
        Car opel = new Car("Opel", "Astra", "Silver", 1999);
        Car volvo = new Car("Volvo", "XC60", "Black", 2020);
        Phone iphone = new Phone("Iphone", 5.3, "ios", "White", 8);
        Phone samsung = new Phone("Samsung", 6.0, "Android", "Black", 6);
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


    }
}
