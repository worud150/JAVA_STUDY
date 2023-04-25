package com.green.java.ch07.Poly;

public class PolyQuiz1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Bulldog bd1 = new Bulldog();
        Cat cat1 = new Cat();
        Duck duck1  = new Duck();


        animalCryingCall(dog1);
        animalCryingCall(bd1);
        animalCryingCall(cat1);
        animalCryingCall(duck1);


    }
    static void animalCryingCall(Animal cr){
        cr.crying();
        if (cr instanceof Dog) {
            Dog dog = (Dog) cr;
            dog.jump();
        }
    }
}
