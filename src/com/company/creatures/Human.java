package com.company.creatures;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal{
    public String firstName;
    public String lastName;
    public Integer age;
    public Animal pet;
    public Car car;
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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if(salary > car.value){
            this.car = car;
            System.out.println("Udało sie kupić auto za gotówkę!");
        }else if(salary > (car.value / 12)){
            this.car = car;
            System.out.println("Udało się kupić auto na kredyt!");
        }else{
            System.out.println("Nie udało się kupić auta, za mało zarabiasz");
        }
    }

    public String toString(){
        return "Imie: " + firstName + " Nazwisko: " + lastName + " Wiek: " + age;
    }
}
