package com.company;

public class Human {
    public String firstName;
    public String lastName;
    public Integer age;
    public Animal pet;

    public Human(String firstName, String lastName, Integer age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Animal getPet() {
        return pet;
    }
}
