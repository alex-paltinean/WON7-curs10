package com.fasttrack.polymorphism;

public class Dog extends Animal {
    public Dog(Integer weight) {
        super(weight);
    }

    @Override
    public String talk() {
        return "ham-ham";
    }
}
