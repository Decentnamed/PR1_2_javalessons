package com.company;

public class Main {

    public static void main(String[] args) {
        Human student = new Human("Dawid", "Grabowicz", 25);
        Human teacher = new Human("Zbigniew", "Boniek", 25);
        System.out.println("---------------------------------------------");
        student.setSalary(0.0);
        System.out.println("---------------------------------------------");
        System.out.println(student.getSalary());
        System.out.println("---------------------------------------------");
        student.setSalary(-1.0);
        System.out.println("---------------------------------------------");
        System.out.println(student.getSalary());
        System.out.println("---------------------------------------------");
        student.setSalary(100.0);
        System.out.println("---------------------------------------------");
        System.out.println(student.getSalary());

    }
}
