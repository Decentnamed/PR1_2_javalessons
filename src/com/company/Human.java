package com.company;
import com.company.devices.Car;

public class Human {
    public String firstName;
    public String lastName;
    public Integer age;
    public Animal pet;
    private Car car;
    public Double salary;


    public Human(String firstName, String lastName, Integer age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = 0.0;
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
