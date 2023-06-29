package com.green.java.ch07;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireCar fc = new FireCar();
        FireCar fc2 =null;

        fc.water();
        car = fc; //결국 형변환이 일어남

        System.out.println("----------");
        fc2 = (FireCar)car;
        fc2.water();

        car = new Car();
        if (car instanceof Object) { // 뒤에쓰는 친구가 받는 친구
            fc2 = (FireCar)car;
            fc2.water();
        } else {
            System.out.println("안돼!");
        }
    }
}

class Car {
    void drive (){
        System.out.println("drive, Brrrrr~");
    }
    void stop() {
        System.out.println("stop!!!");
    }
}

class FireCar extends Car {
    void water (){
        System.out.println("water");
    }
}