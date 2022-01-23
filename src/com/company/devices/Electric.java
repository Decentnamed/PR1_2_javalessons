package com.company.devices;

public class Electric extends Car{
    public Electric(String producer, String model, Integer yearOfProduction, String colour) {
        super(producer, model, yearOfProduction, colour);
    }

    @Override
    public void Refuel() {
        this.capacitance  = 60.0;
        System.out.println("Naladowano elektryczny samochod do " + capacitance + "kWh");
    }
}
