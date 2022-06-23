package com.fasttrack.polymorphism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Dog(10);
//        System.out.println(animal.talk());

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(12));
        animals.add(new Dog(12));
        animals.add(new Cat(12));

        List<Animal> a2 = new LinkedList<>(animals);

        for (Animal a : animals) {
//            System.out.println(a.talk());
        }

        Person person = new Person(new Cat(15));
        person.talkWithPet();
    }
}
