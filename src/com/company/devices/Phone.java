package com.company.devices;

import com.company.creatures.Human;

public class Phone extends Device{
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
}
