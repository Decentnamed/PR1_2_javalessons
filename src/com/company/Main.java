package com.company;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.LPG;
import com.company.devices.Phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Diesel opel = new Diesel("Opel", "Astra", 1999, "Silver");
        Electric tesla = new Electric("Tesla", "v1", 2020, "Red");
        LPG vagen = new LPG("Volkswagen", "golf 4", 2000, "Black");
        Phone iphone = new Phone("Apple", "ios", 2020, 5.3, 8);
        Human student = new Human();
        Human teacher = new Human();
        Human dziekan = new Human();
        opel.value = 10000.00;
        tesla.value = 100000.00;
        vagen.value = 1000.00;
        student.firstName = "STUDENT";
        student.lastName = "GRABOWICZ";
        student.age = 25;
        teacher.firstName = "TEACHER";
        teacher.lastName = "WODECKI";
        teacher.age = 70;
        dziekan.firstName = "DZIEKAN";
        dziekan.lastName = "BRZECZEK";
        dziekan.age = 80;
        student.cash = 100000.00;
        teacher.cash = 100000.00;
        dziekan.cash = 1000000.00;
        student.salary = 1000000.00;
        teacher.salary = 1000000.00;
        dziekan.salary = 1000000.00;
        System.out.println("TEST 1 -----------------------");
        student.addCar(opel);
        opel.carOwners();
        System.out.println("TEST 2 -----------------------");
        student.setCar(opel, 1);
        opel.carOwners();
        System.out.println("TEST 3-----------------------");
        opel.Sale(student, teacher, 10.0);
        opel.carOwners();
        System.out.println("TEST 4-----------------------");
        student.addCar(opel);
        opel.Sale(student, teacher, 10.0);
        System.out.println("TEST 5-----------------------");
        System.out.println("Byli jacys wlasciciele? " + opel.checkOwners());
        System.out.println("Byli jacys wlasciciele? " + tesla.checkOwners());
        System.out.println("TEST 6-----------------------");
        System.out.println("Liczba transakcji sprzedazy tego auta: " + opel.transactionCount());
        System.out.println("TEST 7-----------------------");
        System.out.println("SPRAWDZANIE SPRZEDAZY ( STUDENT DLA TEACHERA) " + opel.checkSelling(student, teacher));
        System.out.println("SPRAWDZANIE SPRZEDAZY ( TEACHER DLA STUDENTA) " + opel.checkSelling(teacher, student));
        System.out.println("SPRAWDZANIE SPRZEDAZY ( TEACHER DLA DZIEKANA) " + opel.checkSelling(teacher, dziekan));
        System.out.println("SPRAWDZANIE SPRZEDAZY ( DZIEKAN DLA TEACHERA) " + opel.checkSelling(dziekan, teacher));
        System.out.println("SPRAWDZANIE SPRZEDAZY ( STUDENT DLA DZIEKANA) " + opel.checkSelling(student, dziekan));
        System.out.println("SPRAWDZANIE SPRZEDAZY ( DZIEKAN DLA STUDENTA) " + opel.checkSelling(dziekan, student));












        /*
        System.out.println("TEST 1---------------------------------------------");
        student.addCar(opel);
        student.addCar(tesla);
        System.out.println("GOTOWKA W KIESZENI STUDENT PRZED SPRZEDAZA = " + student.cash);
        System.out.println("GOTOWKA W KIESZENI TEACHER PRZED KUPNEM = " + teacher.cash);
        opel.Sale(student, teacher, 10.0);
        System.out.println("GOTOWKA W KIESZENI STUDENT PO SPRZEDAZY = " + student.cash);
        System.out.println("GOTOWKA W KIESZENI TEACHER PO KUPNIE = " + teacher.cash);
        System.out.println("TEST 2---------------------------------------------");
        tesla.Sale(student, teacher, 1000000.00);
        System.out.println("TEST 3---------------------------------------------");
        vagen.Sale(student, teacher, 10.0);
        System.out.println("TEST 4---------------------------------------------");
        dziekan.addCar(tesla);
        dziekan.addCar(tesla);
        dziekan.addCar(tesla);
        dziekan.addCar(tesla);
        dziekan.addCar(tesla);
        dziekan.addCar(tesla);
        dziekan.addCar(tesla);
        dziekan.addCar(tesla);
        dziekan.addCar(tesla);
        dziekan.addCar(tesla);
        tesla.Sale(student, dziekan, 1000000.00);
        System.out.println("TEST 5---------------------------------------------");
        dziekan.carList();
        student.carList();
        System.out.println("TEST 6---------------------------------------------");
        System.out.println("Wartosc samochodow w garazu, DZIEKAN = " + dziekan.getGarageValue() + " PLN");
        System.out.println("Wartosc samochodow w garazu, DZIEKAN = " + student.getGarageValue() + " PLN");
        System.out.println("TEST 7---------------------------------------------");
        System.out.println(dziekan.hasFreeSpace());
        System.out.println(student.hasFreeSpace());
        System.out.println("TEST 8---------------------------------------------");
        System.out.println(dziekan.hasCar(tesla));
        System.out.println(student.hasCar(opel));
        System.out.println("TEST 9---------------------------------------------");
        dziekan.carList();
        dziekan.removeCar(tesla);
        dziekan.carList();
        System.out.println(dziekan.hasFreeSpace());
        System.out.println("TEST 10---------------------------------------------");
        teacher.carList();
        teacher.addCar(tesla);
        teacher.addCar(vagen);
        teacher.addCar(opel);
        teacher.addCar(vagen);
        teacher.addCar(tesla);
        teacher.carList();
        teacher.sortCars();
        teacher.carList();
         */
    }
}
