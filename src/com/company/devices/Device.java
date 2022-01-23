package com.company.devices;

public abstract class Device {
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

    public String toString(){
        return "";
    }
}
