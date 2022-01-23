package com.company.devices;

public class Phone {
    public String model;
    public Double screenSize;
    public String os;
    public String colour;
    public Integer ramSize;

    public Phone(String model, Double screenSize, String os, String colour, Integer ramSize){
        this.model = model;
        this.screenSize = screenSize;
        this.os = os;
        this.colour = colour;
        this.ramSize = ramSize;
    }

    public String toString(){
        return "Model: " + model + " Screen size: " + screenSize + " Os: " + os + " Kolor: " + colour + "Ram size: " + ramSize + " GB";
    }
}
