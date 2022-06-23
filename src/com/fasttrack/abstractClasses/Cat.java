package com.fasttrack.abstractClasses;

public class Cat extends Animal {
    public Cat(Integer weight) {
        super(weight);
    }

    public void bite() {
        System.out.println("Auch!");
    }

    @Override
    public String talk() {
        return "miau";
    }
}
