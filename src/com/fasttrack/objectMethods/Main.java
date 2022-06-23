package com.fasttrack.objectMethods;

public class Main {
    public static void main(String[] args) {
        Object o = new Car();
        method(o);
    }

    public static void method(Object o) {
        if (o instanceof Car) {
            System.out.println("It's a car!");
            Car car = (Car) o;
            System.out.println(car.getSpeed());
        } else {
            System.out.println("It's not a car!");
        }
    }
}
