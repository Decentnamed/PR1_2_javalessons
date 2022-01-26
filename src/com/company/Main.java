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
        Phone samsung = new Phone("Samsung", "Android", 2020, 6.0, 8);
        Human student = new Human();
        Human teacher = new Human();
        Human dziekan = new Human();
        Applications youTube = new Applications("Youtube", "1.1", 100.0);
        Applications instagram = new Applications("Instagram", "1.2", 50.0);
        Applications tikTok = new Applications("TikTok", "1.3", 25.0);
        Applications gmail = new Applications("Gmail", "2.0", 0.0);
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
        System.out.println("TEST 1------------------------------");
        System.out.println("ILOSC PIENIEDZY STUDENTA W KIESZENI PRZED INSTALACJA " + student.cash + " pln");
        iphone.installAnApp(student, youTube);
        System.out.println("ILOSC PIENIEDZY STUDENTA W KIESZENI PO INSTALACJI " + student.cash + " pln");
        System.out.println("TEST 2------------------------------");
        System.out.println("Sprawdzanie po zadaniu obiektu do metody:");
        System.out.println("Aplikacja " + youTube.name + " zainstalowana? " + iphone.appIsInstalled(youTube));
        System.out.println("Aplikacja " + instagram.name + " zainstalowana? " + iphone.appIsInstalled(instagram));
        System.out.println("TEST 3------------------------------");
        System.out.println("Sprawdzanie bo zadaniu nazwy aplikacji do metody: ");
        System.out.println("Aplikacja " + youTube.name + " zainstalowana? " + iphone.appIsInstalled(youTube.name));
        System.out.println("Aplikacja " + instagram.name + " zainstalowana? " + iphone.appIsInstalled(instagram.name));
        System.out.println("TEST 4------------------------------");
        iphone.allFreeApps();
        System.out.println("TEST 5------------------------------");
        iphone.installAnApp(student, gmail);
        iphone.allFreeApps();
        System.out.println("TEST 6------------------------------");
        System.out.println("VALUE ALL INSTALLED APPS: " + iphone.valueInstalledApps() + " PLN");
        System.out.println("TEST 7------------------------------");
        iphone.installAnApp(student, tikTok);
        iphone.installAnApp(student, instagram);
        iphone.allInstalledAppNames();
        System.out.println("TEST 8------------------------------");
        iphone.allInstalledAppCheapest();
        System.out.println("TEST 9------------------------------");
        samsung.installAnApp(teacher, youTube);
        samsung.installAnApp(teacher, youTube);














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
