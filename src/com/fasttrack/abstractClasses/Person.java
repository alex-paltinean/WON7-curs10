package com.fasttrack.abstractClasses;

public class Person {
    private Animal pet;

    public Person(Animal pet) {
        this.pet = pet;
    }

    public void talkWithPet() {
        System.out.println("What's up?");
        System.out.println(pet.talk());
    }

    @Override
    public String toString() {
        return "Person{" +
                "pet=" + pet +
                '}';
    }
}
