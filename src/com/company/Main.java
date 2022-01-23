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

        opel.value = 10000.00;
        tesla.value = 100000.00;
        vagen.value = 1000.0;

        Human student = new Human();
        Human teacher = new Human();
        Human dziekan = new Human();

        student.addCar(opel);
        student.addCar(tesla);
        student.addCar(vagen);
        student.addCar(opel);
        student.addCar(tesla);
        student.addCar(vagen);
        student.addCar(opel);
        student.addCar(tesla);
        student.addCar(vagen);
        student.addCar(opel);
        student.addCar(tesla);
        student.addCar(vagen);
        student.addCar(opel);
        student.addCar(tesla);
        student.addCar(vagen);
        student.removeCar(tesla);
        System.out.println(student.hasCar(opel));
        System.out.println(student.getGarageValue());
        teacher.addCar(opel);
        teacher.addCar(tesla);
        teacher.addCar(vagen);
        System.out.println("----------------------------------");
        opel.Sale(student, teacher, 10.0);
        System.out.println("----------------------------------");
        teacher.cash = 10.0;
        System.out.println("Ilosc pieniedzy w portfelu przed kupnem nauczyciel " + teacher.cash);
        System.out.println("Ilosc pieniedzy w portfelu przed kupnem student " + student.cash);
        opel.Sale(student,teacher,10.0);
        System.out.println("Ilosc pieniedzy w portfelu po zakupie nauczyciel " + teacher.cash);
        System.out.println("Ilosc pieniedzy w portfelu po zakupie student " + student.cash);
        System.out.println("----------------------------------");
        opel.Sale(dziekan, student, 10.0);
        System.out.println("----------------------------------");
        student.cash = 1000.0;
        opel.Sale(teacher, student, 10.0);
        System.out.println("----------------------------------");
        dziekan.cash = 10000.0;
        opel.Sale(student, dziekan, 10.0);







    }
}
