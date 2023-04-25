package com.green.java.ch07.Poly;

public class Animal {

    private String name;

    public void crying() {
        System.out.println("동물이 운다.");
    }
    public Animal(){}
    public Animal (String name){
        this.name = name;
    }
}

class Dog extends Animal {
    @Override // 부모가가진 메소드를 사용하는것이 아니라 재정의 내림
    public void crying() {
        System.out.println("멍!멍!");
    }

    public void jump() {
        System.out.println("개가 점프!");
    }
}

class Bulldog extends Dog {
    @Override
    public void crying() {
        System.out.println("으르렁!!");
    }
}

class Cat extends Animal {
    @Override
    public void crying() {
        System.out.println("야옹 야옹");
    }
}

class Duck extends Animal {
    @Override
    public void crying() {
        System.out.println("꽥 꽥");
    }
}
