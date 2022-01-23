package com.company.devices;

public class Car extends Device {
    public Double engineVolume;
    public String plates;
    public Double value;

    public Car(String producer, String model, Integer yearOfProduction, String colour) {
        super(producer, model, yearOfProduction, colour);
        this.engineVolume = 1.9;
        this.value = 0.0;
        this.plates = "GD 08D30";
    }

    @Override
    public void turnOn() {
        System.out.println("Przekrecam kluczyk");
        System.out.println("Silnik się kreci i odpala");
        System.out.println("Chodzi na wolnych obrotach");
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
