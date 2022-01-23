package com.company.devices;

public class Car {
    final String model;
    final String producer;
    public String colour;
    public String engineVolume;
    public String plates;
    public Integer yearOfProduction;
    public Double value;

    public Car(String model, String producer, String colour, Integer yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.colour = colour;
        this.yearOfProduction = yearOfProduction;
        this.value = 0.0;
    }

    public String toString(){
        return "Model: " + model + " Producent: " + producer + " Kolor: " + colour + " Rok produkcji: " + yearOfProduction;
    }
}
