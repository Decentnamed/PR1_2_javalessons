package com.company.creatures;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Arrays;

public class Human extends Animal{
    private static final int DEFAULT_GARAGE_SIZE = 10;
    public String firstName;
    public String lastName;
    public Integer age;
    public Animal pet;
    public Car[] garage;
    public Phone mobile;
    public Double salary;
    public Double cash;


    public Human(){
        super("homo sapiens");
        this.firstName = "";
        this.lastName = "lastName";
        this.age = 0;
        this.salary = 0.0;
        this.cash = 0.0;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Animal getPet() {
        return pet;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if(salary <= 0){
            System.out.println("Nie sądze, nie bede robil za darmo, a tym bardziej doplacal");
        }else{
            System.out.println("Nowe dane zostaly wyslane do systemu ksiegowego");
            System.out.println("Proszę odebrac aneks w dziale kadr");
            System.out.println("ZUS i US został poinformowany o zmianie wypłaty");
            this.salary = salary;
        }
    }

    public Car getCar(Integer space) {
        return garage[space];
    }

    public void setCar(Car car, Integer space) {
        if(salary > car.value){
            if(garage[space] != null){
                this.garage[space] = car;
                System.out.println("Udało sie kupić auto za gotówkę!");
            }else{
                System.out.println("To miejsce w garazu jest juz zajete przez inne auto");
            }
        }else if(salary > (car.value / 12)){
            if(garage[space] != null){
                this.garage[space] = car;
                System.out.println("Udało się kupić auto na kredyt!");
            }else{
                System.out.println("To miejsce w garazu jest juz zajete przez inne auto");
            }
        }else{
            System.out.println("Nie udało się kupić auta, za mało zarabiasz");
        }
    }

    public String toString(){
        return "Imie: " + firstName + " Nazwisko: " + lastName + " Wiek: " + age;
    }

    public boolean hasCar(Car newCar) {
        for (Car car : this.garage) {
            if (car != null && car.equals(newCar)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFreeSpace() {
        for (Car car : this.garage) {
            if (car != null) {
                return true;
            }
        }
        return false;
    }

    public void removeCar(Car car) {
        for(int i = 0; i < this.garage.length; i++){
            if(this.garage[i] == car){
                this.garage[i] = null;
                i = this.garage.length;
                System.out.println("Usunieto samochod " + car + " z garazu");
            }else{
                System.out.println("Nie masz takiego auta w garazu");
            }
        }
    }

    public void addCar(Car car) {
        Integer space = 0;
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                this.garage[i] = car;
                System.out.println("Dodano auto do garazu w miejsce nr: " + i);
                i = this.garage.length;
            }else{
                if(i == this.garage.length - 1){
                    System.out.println("Nie masz miejsca w garazu");
                }
            }
        }

    }

    public Double getGarageValue(){
        Double totalValue = 0.0;
        for (Car car : this.garage) {
            if (car != null) {
                totalValue += car.value;
            }
        }
        System.out.println("Łączna wartość samochodow w garazu:");
        return totalValue;
    }

}
