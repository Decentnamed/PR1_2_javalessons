package com.company.devices;

import com.company.creatures.Human;

import java.util.ArrayList;
import java.util.List;


public abstract class Car extends Device {
    public Double engineVolume;
    public String plates;
    public Double value;
    public Double oil;
    public Double capacitance;
    public Double gas;
    public List<Human> owners;
    public Human currentOwner;
    public List<String> transactions;
    public List<Human> sellers;
    public List<Human> buyers;

    public Car(String producer, String model, Integer yearOfProduction, String colour) {
        super(producer, model, yearOfProduction, colour);
        this.engineVolume = 1.9;
        this.value = 0.0;
        this.plates = "GD 08D30";
        this.oil = 0.0;
        this.capacitance = 0.0;
        this.gas = 0.0;
        this.owners = new ArrayList<>();
        this.currentOwner = null;
        this.transactions = new ArrayList<>();
        this.sellers = new ArrayList<>();
        this.buyers = new ArrayList<>();
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
            System.out.println(buyer + " SORRY, NIE MASZ TYLE KASY");
        } else if (!seller.hasCar(this)){
            System.out.println(seller + " SORRY, NIE MASZ TAKIEGO SAMOCHODU");
        } else if (!buyer.hasFreeSpace()){
            System.out.println(buyer + " SORRY, NIE MASZ MIEJSCA W GARAZU");
        } else if (seller != currentOwner){
            System.out.println("SORRY, NIE JESTES AKTUALNYM WLASCICIELEM POJAZDU, CZY NA PEWNO JEST TWOJ?");
        } else{
            seller.cash += price;
            buyer.cash -= price;
            seller.removeCar(this);
            buyer.addCar(this);
            this.owners.add(buyer);
            this.sellers.add(seller);
            this.buyers.add(buyer);
            this.transactions.add("Sprzedal: " + seller.firstName + " kupił: " + buyer.firstName);
            System.out.println(seller + ": Udalo sie sprzedac samochód za " + price + " pln dla: " + buyer);
        }
    }


    public abstract void Refuel();

    public void carOwners(){
        System.out.println("Lista właścicieli pojazdu: " + this);
        int counter = 1;
        if(owners.size() == 0){
            System.out.println("BRAK AKTUALNYCH WLASCICIELI");
        }else{
            for (Human human : owners) {
                if(counter == owners.size()){
                    this.currentOwner = human;
                    System.out.println(counter + ") " + this.currentOwner + " - Aktualny wlaściciel pojazdu");
                }else{
                    System.out.println(counter + ") " + human);
                    counter += 1;
                }
            }
        }
    }

    public boolean checkOwners(){
        return owners.size() != 0;
    }

    public boolean checkSelling(Human seller, Human buyer){
        for (int i = 0; i < transactionCount(); i++) {
            if(sellers.contains(seller) && buyers.contains(buyer))
                if(sellers.get(i) == seller && buyers.get(i) == buyer){
                    return true;
            }
        }
        return false;
    }

    public Integer transactionCount(){
        int counter = 0;
        for (String transaction : transactions) {
            counter += 1;
        }
        return counter;
    }

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
