package com.fasttrack.polymorphism;

public class Animal {
    private Integer weight;

    public Animal(Integer weight) {
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

    public String talk() {
        return "";
    }
}
