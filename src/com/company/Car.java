package com.company;

public class Car {
    final String model;
    final String producer;
    public String colour;
    public String engineVolume;
    public String plates;
    public Integer yearOfProduction;

    public Car(String model, String producer, String colour, Integer yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.colour = colour;
        this.yearOfProduction = yearOfProduction;
    }
}
