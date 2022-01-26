package com.company.devices;

import com.company.Applications;
import com.company.creatures.Human;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Phone extends Device {
    private static final String DEFAULT_APP_VERSION = "latest";
    private static final String DEFAULT_APP_SERVER = "server.apek.com";
    private static final int DEFAULT_PORT_SERVER = 8;
    private static final String DEFAULT_PROTOCOL_SERVER = "https";
    public Double screenSize;
    public String os;
    public Integer ramSize;
    public List<Applications> appList;



    public Phone(String producer, String model, Integer yearOfProduction, Double screenSize, Integer ramSize){
        super(producer, model, yearOfProduction, "white");
        this.screenSize = 0.0;
        this.ramSize = 0;
        this.os = "Not assigned";
        this.appList = new ArrayList<>();

    }

    @Override
    public void turnOn() {
        System.out.println("Włączanie");
        System.out.println("Czarny ekran");
        System.out.println("Inicjalizacja systemu..");
        System.out.println("Czekaj...");
        System.out.println("Czekaj...");
        System.out.println("Czekaj...");
        System.out.println("Uruchomiono urządzenie, na ekranie pojawilo sie logo!");
    }

    @Override
    public void Sale(Human seller, Human buyer, Double price) {
        if (buyer.cash < price){
            System.out.println("SORRY, NIE MASZ KASY");
        } else if (seller.mobile != this){
            System.out.println("SORRY, NIE MASZ TELEFONU");
        } else{
            seller.cash += price;
            buyer.cash -= price;
            seller.mobile = null;
            buyer.mobile = this;
            System.out.println("Udalo sie sprzedac telefon za " + price + " pln");
        }
    }

    @Override
    public String toString(){
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", screenSize=" + screenSize +
                ", os='" + os + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

    public void installAnApp(Human human, Applications appName){
        if(human.cash > appName.price){
            if(appList.contains(appName)){
                System.out.println("Ta aplikacja jest juz zainstalowana - " + appName.name);
            }else{
                appList.add(appName);
                human.cash -= appName.price;
                System.out.println("==================");
                System.out.println("Sprawdzanie adresu docelowego");
                System.out.println("Sprawdzanie rozmiaru aplikacji");
                System.out.println("Sprawdzanie miejsca na telefonie");
                System.out.println("Obsluga platnosci");
                System.out.println("Pobieranie aplikacji");
                System.out.println("Rozpakowywanie palikacji");
                System.out.println("Instalacja aplikacji " + appName.name);
                System.out.println("==================");
                appName.appIsInstalled = true;
            }
        }
    }


    public boolean appIsInstalled(Applications appName){
        return appName.appIsInstalled;
    }
    public boolean appIsInstalled(String appName){
        for (Applications app: appList) {
            if(Objects.equals(app.name, appName) && app.appIsInstalled){
                return true;
            }
        }
        return false;
    }

    public void allFreeApps(){
        System.out.println("APP LIST FOR FREE");
        int counter = 0;
        for (Applications app:appList) {
            if(app.price == 0.0){
                System.out.println("1) " + app);
                counter += 1;
            }
        }
        if(counter == 0){
            System.out.println("NO FREE APPS");
        }
    }

    public Double valueInstalledApps(){
        double value = 0.0;
        for (Applications app:appList) {
            if(app.appIsInstalled){
                value += app.price;
            }
        }
        return value;
    }


    public void allInstalledAppNames(){
        System.out.println("Lista aplikacji w kolejnosci alfabetycznej: ");
        String[] tempNames = new String[appList.size()];
        int counter = 0;
        for (Applications app:appList) {
            if(app.appIsInstalled){
                tempNames[counter] = app.name;
                counter += 1;
            }
        }
        Arrays.sort(tempNames);
        for(int i = 0; i < tempNames.length; i ++){
            System.out.println(i+1 + ") " + tempNames[i]);
        }
    }

    public void allInstalledAppCheapest(){
        Double[] tempPrices = new Double[appList.size()];
        System.out.println("Lista aplikacji od najtanszej do najdroższej: ");
        int counter = 0;
        for (Applications app:appList) {
            if(app.appIsInstalled){
                tempPrices[counter] = app.price;
                counter += 1;
            }
        }
        Arrays.sort(tempPrices);
        for(int i = 0; i < tempPrices.length; i ++){
            System.out.println(i+1 + ") " + tempPrices[i]);
        }
    }
}
