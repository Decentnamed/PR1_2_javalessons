package com.company;

public class Main {

    public static void main(String[] args) {
        Human student = new Human("Dawid", "Grabowicz", 25);
        Human teacher = new Human("Zbigniew", "Boniek", 25);
        Car opel = new Car("Opel", "Astra", "Silver", 1999);
        opel.value = 100.0;
        student.setSalary(0.0);
        student.setCar(opel);
        System.out.println("---------------------------------------------------");
        student.setSalary(50.0);
        student.setCar(opel);
        System.out.println("---------------------------------------------------");
        student.setSalary(200.0);
        student.setCar(opel);


    }
}
