package com.fasttrack.polymorphism;

public class Person {
    private Animal pet;

    public Person(Animal pet) {
        this.pet = pet;
    }

    public void talkWithPet() {
        System.out.println("What's up?");
        System.out.println(pet.talk());
    }
}
