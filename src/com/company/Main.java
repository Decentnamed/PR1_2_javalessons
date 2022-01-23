package com.company;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.LPG;
import com.company.devices.Phone;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Diesel opel = new Diesel("Opel", "Astra", 1999, "Silver");
        Electric tesla = new Electric("Tesla", "v1", 2020, "Red");
        LPG vagen = new LPG("Volkswagen", "golf 4", 2000, "Black");
        Phone iphone = new Phone("Apple", "ios", 2020, 5.3, 8);
        iphone.installAnApp("gmail");
        iphone.installAnApp("facebook", "v1.01");
        System.out.println("-----------------------------------------------------------");
        List<String> apps = new ArrayList<>();
        apps.add("RiseOfKingdoms");
        apps.add("FarmSimulator");
        apps.add("NeedForSpeed");
        iphone.installAnApp(apps);
        System.out.println("-----------------------------------------------------------");
        System.out.println(opel.oil);
        opel.Refuel();
        System.out.println(opel.oil);
        System.out.println("--------------------------------");
        System.out.println(tesla.capacitance);
        tesla.Refuel();
        System.out.println(tesla.capacitance);
        System.out.println("--------------------------------");
        System.out.println(vagen.gas);
        vagen.Refuel();
        System.out.println(vagen.gas);
    }
}
