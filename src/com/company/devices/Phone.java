package com.company.devices;

import com.company.creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device{
    private static final String DEFAULT_APP_VERSION = "latest";
    private static final String DEFAULT_APP_SERVER = "server.apek.com";
    private static final int DEFAULT_PORT_SERVER = 8;
    private static final String DEFAULT_PROTOCOL_SERVER = "https";
    public Double screenSize;
    public String os;
    public Integer ramSize;


    public Phone(String producer, String model, Integer yearOfProduction, Double screenSize, Integer ramSize){
        super(producer, model, yearOfProduction, "white");
        this.screenSize = 0.0;
        this.ramSize = 0;
        this.os = "Not assigned";
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

    public void installAnApp(List<String> appNames){
        System.out.println("Instalowanie aplikacji z listy");
        for(String appName : appNames){
            this.installAnApp(appName);
        }
    }

    public void installAnApp(String appName){
        System.out.println("Instalowanie aplikacji wedlug nazwy: " + appName);
        this.installAnApp(appName, DEFAULT_APP_VERSION);
    }
    public void installAnApp(String appName, String version){
        System.out.println("Instalowanie aplikacji wedlug nazwy: " + appName + " i wersji: " + version);
        this.installAnApp(appName, version, DEFAULT_APP_SERVER);
    }
    public void installAnApp(String appName, String version, String server){
        System.out.println("Instalowanie aplikacji wedlug nazwy: " + appName + " i wersji: " + version + " z servera: " + server);
        try {
            URL url = new URL(DEFAULT_PROTOCOL_SERVER, server, DEFAULT_PORT_SERVER, appName + "-" + version);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void installAnApp(URL url){
        System.out.println("Sprawdzanie adresu docelowego");
        System.out.println("Sprawdzanie rozmiaru aplikacji");
        System.out.println("Sprawdzanie miejsca na telefonie");
        System.out.println("Obsluga platnosci");
        System.out.println("Pobieranie aplikacji");
        System.out.println("Rozpakowywanie palikacji");
        System.out.println("Instalacja");
    }
}
