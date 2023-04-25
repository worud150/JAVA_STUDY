package com.green.java.ch06;

public class CarTes2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model = "소나타";
        Car.brand = "기아";
        c1.price = 20000;

        Car.powerOn();
        c1.printinfo();
    }

}
