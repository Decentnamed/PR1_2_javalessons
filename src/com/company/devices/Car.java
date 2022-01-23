package com.company.devices;

import com.company.creatures.Human;

import java.util.Comparator;

public abstract class Car extends Device {
    public Double engineVolume;
    public String plates;
    public Double value;
    public Double oil;
    public Double capacitance;
    public Double gas;

    public Car(String producer, String model, Integer yearOfProduction, String colour) {
        super(producer, model, yearOfProduction, colour);
        this.engineVolume = 1.9;
        this.value = 0.0;
        this.plates = "GD 08D30";
        this.oil = 0.0;
        this.capacitance = 0.0;
        this.gas = 0.0;
    }

    @Override
    public void turnOn() {
        System.out.println("Przekrecam kluczyk");
        System.out.println("Silnik się kreci i odpala");
        System.out.println("Chodzi na wolnych obrotach");
    }

    @Override
    public void Sale(Human seller, Human buyer, Double price) {
        if (buyer.cash < price){
            System.out.println("SORRY, NIE MASZ KASY");
        } else if (!seller.hasCar(this)){
            System.out.println("SORRY, NIE MASZ SAMOCHODU");
        } else if (buyer.hasFreeSpace()){
            System.out.println("SORRY, NIE MIEJSCA W GARAZU");
        } else{
            seller.cash += price;
            buyer.cash -= price;
            seller.removeCar(this);
            buyer.addCar(this);
            System.out.println("Udalo sie sprzedac samochód za " + price + " pln");
        }
    }

    public abstract void Refuel();

    @Override
    public String toString(){
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineVolume=" + engineVolume +
                ", plates=" + plates +
                ", value='" + value + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
