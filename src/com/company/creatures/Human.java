package com.company.creatures;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Arrays;
import java.util.Objects;


public class Human extends Animal {
    private static final int DEFAULT_GARAGE_SIZE = 10;
    public String firstName;
    public String lastName;
    public Integer age;
    public Animal pet;
    public Car[] garage;
    public Phone mobile;
    public Double salary;
    public Double cash;


    public Human() {
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
        if (salary <= 0) {
            System.out.println("Nie sądze, nie bede robil za darmo, a tym bardziej doplacal");
        } else {
            System.out.println("Nowe dane zostaly wyslane do systemu ksiegowego");
            System.out.println("Proszę odebrac aneks w dziale kadr");
            System.out.println("ZUS i US został poinformowany o zmianie wypłaty");
            this.salary = salary;
        }
    }

    public Car getCar(Integer space) {
        if (space != null) {
            return garage[space];
        } else {
            return null;
        }
    }

    public void setCar(Car car, Integer space) {
        if (salary > car.value) {
            if (garage[space] != null) {
                this.garage[space] = car;
                System.out.println("Udało sie kupić auto za gotówkę!");
            } else {
                System.out.println("To miejsce w garazu jest juz zajete przez inne auto");
            }
        } else if (salary > (car.value / 12)) {
            if (garage[space] != null) {
                this.garage[space] = car;
                System.out.println("Udało się kupić auto na kredyt!");
            } else {
                System.out.println("To miejsce w garazu jest juz zajete przez inne auto");
            }
        } else {
            System.out.println("Nie udało się kupić auta, za mało zarabiasz");
        }
    }

    public String toString() {
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
        int counterSpace = DEFAULT_GARAGE_SIZE;
        for (Car car : this.garage) {
            if (car != null) {
                counterSpace -= 1;
            }
        }
        return counterSpace != 0;
    }

    public void removeCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == car) {
                this.garage[i] = null;
                i = this.garage.length;
                System.out.println(this.firstName + ": Usunieto samochod " + car + " z garazu");
            } else {
                if (i == this.garage.length - 1) {
                    System.out.println("Nie masz takiego auta w garazu");
                }
            }
        }

    }

    public void addCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                this.garage[i] = car;
                System.out.println(this.firstName + ": Dodano auto do garazu w miejsce nr: " + i);
                i = this.garage.length;
            } else {
                if (i == this.garage.length - 1) {
                    System.out.println("Nie masz miejsca w garazu");
                }
            }
        }

    }

    public void carList() {
        int counter = 0;
        System.out.println("Lista samochodów w garazu, " + firstName);
        for (Car car : garage) {
            if (car != null) {
                counter += 1;
            }
        }
        if (counter > 0) {
            for (int i = 0; i < garage.length; i++) {
                if (this.garage[i] != null) {
                    System.out.println(garage[i]);
                } else {
                    System.out.println("Puste miejsce nr." + i);
                }
            }
        } else {
            System.out.println("Nie masz aut w garazu");
        }
    }

    public Double getGarageValue() {
        Double totalValue = 0.0;
        for (Car car : this.garage) {
            if (car != null) {
                totalValue += car.value;
            }
        }
        return totalValue;
    }

    public void sortCars() {
        Car temp; // tymczasowa zmienna CAR
        int carNumberCounter = 0; // LOCZNIK ILOSCI SAMOCHODOW W GARAZU
        Car[] temporaryGarage = new Car[DEFAULT_GARAGE_SIZE]; // TYMCZASOWY GARAZ
        for (Car car : garage) { // PETLA DO PRZELICZANIA ILOSCI SAMOCHODOW W GARAZU
            if (car != null) {
                carNumberCounter += 1;
            }
        }
        int arrayCounter = 0; // INDEKSOWANIE TYMCZASOWEJ TABLICY Z DATAMI PRODUKCJI
        Integer[] tempArray = new Integer[carNumberCounter]; // TYMCZASOWA TABLICA Z DATAMI PRODUKCJI
        for (Car car : garage) { // WYPELNIENIE TYMCZASOWEJ TABLICY WSZYSTKIMI DATAMI Z ROKIEM PRODUKCJI
            if (car != null) {
                tempArray[arrayCounter] = car.yearOfProduction;
                arrayCounter += 1;
            }
        }
        Arrays.sort(tempArray); // POSORTOWANIE TABLICY
        for(int i = 0; i < tempArray.length; i++){ // POROWNYWANIE ROKU PRODUKCJI DO AUT W GARAZU
            for (Car car : garage) {
                if (car != null && Objects.equals(tempArray[i], car.yearOfProduction)) {
                    temp = car; // PRZYPISANIE DO TYMCZASOWEJ ZMIENNEJ AUTA OBIEKTU AUTA Z GARAZU
                    temporaryGarage[i] = temp; // DODANIE AUTA DO TYMCZASOWEGO GARAZU
                }
            }
        }
        garage = temporaryGarage; // PRZYPISANIE POSORTOWANYCH OBIEKTOW Z TYMCZASOWEGO GARAZU DO GARAZU GLOWNEGO
    }
}