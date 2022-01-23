package com.company.devices;

import com.company.Human;
import com.company.Salleable;

public abstract class Device implements Salleable {
    public String producer;
    public String model;
    public Integer yearOfProduction;
    public String colour;

    public Device(String producer, String model, Integer yearOfProduction, String colour) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.colour = colour;
    }

    public abstract void turnOn();

    @Override
    public void Sale(Human seller, Human buyer, Double price) {

    }

    public String toString(){
        return "";
    }
}
