package com.green.java.ch07;

public class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireCar fc = null;

        car = new FireCar();
        car.drive();
        System.out.println("----------------");
        fc = (FireCar) car; //자식은 부모타입을 받을 수 없다
        fc.water();
    }
}
